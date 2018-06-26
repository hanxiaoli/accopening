package jp.co.basenet.accopening.batch.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.data.RepositoryItemReader;
import org.springframework.batch.item.data.builder.RepositoryItemReaderBuilder;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.batch.item.file.transform.FieldExtractor;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import jp.co.basenet.accopening.batch.processor.CoordinateOpeningInfoProcessor;
import jp.co.basenet.accopening.entity.Mynumber;
import jp.co.basenet.accopening.model.CoordinateOpeningInfoModel;
import jp.co.basenet.accopening.repository.MynumberRepository;

@Configuration
@EnableBatchProcessing
public class CoordinateOpeningInfoConfiguration {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Value("${accopening.batch.outputfile}")
	private Resource outputfile;
	
	@Autowired 
	private MynumberRepository mynumberRepository;

	// tag::readerwriterprocessor[]
	// @Bean
	// public CoordinateOpeningInfoReader reader() {
	// return new CoordinateOpeningInfoReader();
	// }

	@Bean
	public RepositoryItemReader<Mynumber> reader() {
		List<String> list = new ArrayList<String>();

		Map<String, Direction> map = new HashMap<String, Direction>();
		map.put("number", Sort.DEFAULT_DIRECTION);
		return new RepositoryItemReaderBuilder<Mynumber>().repository(mynumberRepository).arguments(list).sorts(map).methodName("findAll").name("findAll")
				.build();
	}

	@Bean
	public CoordinateOpeningInfoProcessor processor() {
		return new CoordinateOpeningInfoProcessor();
	}

	@Bean
	public FlatFileItemWriter<CoordinateOpeningInfoModel> writer() {
		return new FlatFileItemWriterBuilder<CoordinateOpeningInfoModel>().lineAggregator(createStudentLineAggregator())
				.resource(outputfile).name("name").build();
	}
	// end::readerwriterprocessor[]

	// tag::jobstep[]
	@Bean
	public Job coordinateOpeningInfoJob(Step coordinateOpeningInfoStep) {
		return jobBuilderFactory.get("coordinateOpeningInfo").incrementer(new RunIdIncrementer())
				.flow(coordinateOpeningInfoStep).end().build();
	}

	@Bean
	public Step coordinateOpeningInfoStep() {
		return stepBuilderFactory.get("coordinateOpeningInfoStep").<Mynumber, CoordinateOpeningInfoModel>chunk(1000)
				.reader(reader()).processor(processor()).writer(writer()).build();
	}
	// end::jobstep[]

	private LineAggregator<CoordinateOpeningInfoModel> createStudentLineAggregator() {
		DelimitedLineAggregator<CoordinateOpeningInfoModel> lineAggregator = new DelimitedLineAggregator<>();
		lineAggregator.setDelimiter(",");

		FieldExtractor<CoordinateOpeningInfoModel> fieldExtractor = createStudentFieldExtractor();
		lineAggregator.setFieldExtractor(fieldExtractor);

		return lineAggregator;
	}

	private FieldExtractor<CoordinateOpeningInfoModel> createStudentFieldExtractor() {
		BeanWrapperFieldExtractor<CoordinateOpeningInfoModel> extractor = new BeanWrapperFieldExtractor<>();
		extractor.setNames(new String[] { "number", "name", "address" });
		return extractor;
	}

}
