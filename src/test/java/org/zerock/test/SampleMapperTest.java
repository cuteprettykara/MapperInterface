package org.zerock.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.persistence.SampleMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class SampleMapperTest {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleMapperTest.class);

	@Inject
	private SampleMapper mapper;
	
	@Test
	public void testTime() {
		logger.debug("*** {}", mapper.getClass().getName());
		logger.debug("*** {}", mapper.getTime());
	}

}