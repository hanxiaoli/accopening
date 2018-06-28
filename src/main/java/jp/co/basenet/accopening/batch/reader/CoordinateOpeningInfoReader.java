package jp.co.basenet.accopening.batch.reader;

import java.util.Iterator;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.support.AbstractItemStreamItemReader;
import org.springframework.beans.factory.annotation.Autowired;

import jp.co.basenet.accopening.entity.Mynumber;
import jp.co.basenet.accopening.repository.MynumberRepository;

//@Component
public class CoordinateOpeningInfoReader extends AbstractItemStreamItemReader<Mynumber> {

	private Iterator<Mynumber> iterator;

	@Autowired
	private MynumberRepository mynumberRepository;

	@Override
	public void open(ExecutionContext executionContext) {
		this.iterator = mynumberRepository.findAll().iterator();
	}

	@Override
	public Mynumber read() throws Exception {
		if (iterator.hasNext()) {
			return iterator.next();
		}

		return null;
	}

}
