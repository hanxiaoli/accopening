/**
 * 
 */
package jp.co.basenet.accopening.batch;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jp.co.basenet.accopening.batch.configuration.CoordinateOpeningInfoConfiguration;

/**
 * @author base
 *
 */
@ContextConfiguration(classes = { CoordinateOpeningInfoConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class CoordinateOpeningInfoTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job job;

	@Test
	public void startBatch() throws Exception {
		jobLauncher.run(job, new JobParameters());
	}

}
