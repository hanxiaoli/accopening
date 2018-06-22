package jp.co.basenet.accopening.batch.reader;

import org.springframework.batch.item.database.builder.HibernatePagingItemReaderBuilder;
import org.springframework.stereotype.Component;

import jp.co.basenet.accopening.entity.Mynumber;

@Component
public class CoordinateOpeningInfoReader extends HibernatePagingItemReaderBuilder<Mynumber> {

	public static String NAME = "read-opening-info";

	public CoordinateOpeningInfoReader() {
		this.queryName("Mynumber.findAll");
	}
}
