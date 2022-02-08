package com.poscoict.container.config.videosystem.mixing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.poscoict.container.videosystem.DVDPlayer;
import com.poscoict.container.videosystem.DigitalVideoDisc;

/*
 * 	JacaConfig2(DVDPlayerConfig)	<-----     JavaConfig1(DVDConfig)
 * 									import
 * 
 * 	JavaConfig2 + JavaConfig1 (각 설정에 대한 내용 + 자신이 가진 설정내용)
 * 
 */

@Configuration
@Import({DVDConfig.class})
public class DVDPlayerConfig {
	
	@Bean
	public DVDPlayer dvdPlayer(@Qualifier("avangersInfinityWar") DigitalVideoDisc dvd) {
		return new DVDPlayer();
	}
	
	
}










