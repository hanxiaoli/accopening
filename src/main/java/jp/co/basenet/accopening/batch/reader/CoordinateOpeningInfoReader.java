package jp.co.basenet.accopening.batch.reader;

import java.util.Iterator;

import javax.persistence.EntityManagerFactory;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.support.AbstractItemStreamItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jp.co.basenet.accopening.entity.Mynumber;
import jp.co.basenet.accopening.repository.MynumberRepository;

//@Component
public class CoordinateOpeningInfoReader extends AbstractItemStreamItemReader<Mynumber> {

	private Iterator<Mynumber> iterator;

	@Autowired
	private MynumberRepository mynumberRepository;

//	@Qualifier
//	private EntityManagerFactory entityManagerFactory;
	//
	// public CoordinateOpeningInfoReader(MynumberRepository mynumberRepository) {
	//
	// this.mynumberRepository = mynumberRepository;
	// }

	@Override
	public void open(ExecutionContext executionContext) {
//		entityManagerFactory.createEntityManager();
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
