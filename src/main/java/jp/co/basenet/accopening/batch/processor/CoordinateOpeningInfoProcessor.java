package jp.co.basenet.accopening.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import jp.co.basenet.accopening.entity.Mynumber;
import jp.co.basenet.accopening.model.CoordinateOpeningInfoModel;

public class CoordinateOpeningInfoProcessor implements ItemProcessor<Mynumber, CoordinateOpeningInfoModel> {

	@Override
	public CoordinateOpeningInfoModel process(final Mynumber mynumber) throws Exception {

		System.out.println(mynumber.getName());
		// mynumber.setNumber(Long.parseLong("123456789012"));

		CoordinateOpeningInfoModel coordinateOpeningInfoModel = new CoordinateOpeningInfoModel();
		coordinateOpeningInfoModel.setNumber(Long.parseLong("123456789012"));
		// log.info("Converting (" + person + ") into (" + transformedPerson + ")");

		return coordinateOpeningInfoModel;
	}
}
