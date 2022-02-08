package com.poscoict.container.videosystem.mixing;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poscoict.container.config.videosystem.mixing.DVDPlayerConfig;
import com.poscoict.container.config.videosystem.mixing.VideoSystemConfig;
import com.poscoict.container.videosystem.DVDPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={VideoSystemConfig.class})
public class DVDPlayerMixingConfig02Test {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Autowired
	private DVDPlayer dvdPlayer;
	
	@Test
	public void testPlayerNotNull() {
		assertNotNull(dvdPlayer);
	}
	
	
}
