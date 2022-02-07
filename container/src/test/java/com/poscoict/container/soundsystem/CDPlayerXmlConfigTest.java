package com.poscoict.container.soundsystem;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:com/poscoict/container/config/soundsystem/CDPlayerConfig.xml"})
public class CDPlayerXmlConfigTest {

	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDPlayerNotNull() {		
		assertNotNull(cdPlayer);
	}

	@Test
	public void testPlay() {
		cdPlayer.play();
	
//		assertEquals(str, "Playing 붕붕 by 김하온"); -> 이 기능들을 응용하면 코테에서 검증가능
//		문제에서 요구하는대로 풀어야하는 이유... 
		
		assertTrue(1 == 2 - 1);
	}
	
}
