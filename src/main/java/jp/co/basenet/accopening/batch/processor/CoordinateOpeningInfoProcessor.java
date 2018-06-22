package jp.co.basenet.accopening.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import jp.co.basenet.accopening.entity.Mynumber;

public class CoordinateOpeningInfoProcessor implements ItemProcessor<Mynumber, Mynumber> {

	@Override
	public Mynumber process(final Mynumber mynumber) throws Exception {

		System.out.println(mynumber.getName());
		mynumber.setNumber(Long.parseLong("123456789012"));

		// log.info("Converting (" + person + ") into (" + transformedPerson + ")");

		return mynumber;
	}
}
