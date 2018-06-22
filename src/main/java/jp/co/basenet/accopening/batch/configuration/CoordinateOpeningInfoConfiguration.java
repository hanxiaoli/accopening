package jp.co.basenet.accopening.batch.configuration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.HibernatePagingItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.co.basenet.accopening.batch.processor.CoordinateOpeningInfoProcessor;
import jp.co.basenet.accopening.batch.reader.CoordinateOpeningInfoReader;
import jp.co.basenet.accopening.entity.Mynumber;

@Configuration
@EnableBatchProcessing
public class CoordinateOpeningInfoConfiguration {
	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	// tag::readerwriterprocessor[]
	@Bean
	public HibernatePagingItemReader<Mynumber> reader() {
		return new CoordinateOpeningInfoReader().build();
	}

	@Bean
	public CoordinateOpeningInfoProcessor processor() {
		return new CoordinateOpeningInfoProcessor();
	}

	@Bean
	public FlatFileItemWriter<Mynumber> writer() {
		return new FlatFileItemWriterBuilder<Mynumber>().build();
	}
	// end::readerwriterprocessor[]

	// tag::jobstep[]
	@Bean
	public Job coordinateOpeningInfo(Step step) {
		return jobBuilderFactory.get("coordinateOpeningInfo").incrementer(new RunIdIncrementer()).flow(step).end()
				.build();
	}

	@Bean
	public Step step() {
		return stepBuilderFactory.get("step").<Mynumber, Mynumber>chunk(1000)
				.reader((HibernatePagingItemReader<Mynumber>) reader())
				.processor((CoordinateOpeningInfoProcessor) processor()).writer((FlatFileItemWriter<Mynumber>) writer())
				.build();
	}
	// end::jobstep[]
}
