package com.poscoict.container.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:com/poscoict/container/config/soundsystem/CDPlayerConfig.xml"})
public class CDPlayerXmlConfigTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDPlayerNotNull() {		
		assertNotNull(cdPlayer);
	}

	@Test
	public void testPlay() {
		cdPlayer.play();
	
		assertEquals("Playing 붕붕 by 김하온", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
//		linux는 \r\n , window는 \n 이므로 둘다 제거
//		문제에서 요구하는대로 풀어야하는 이유... 
//      -> 이 기능들을 응용하면 코테에서 검증가능	
//		assertTrue(1 == 2 - 1);
	}
	
}
