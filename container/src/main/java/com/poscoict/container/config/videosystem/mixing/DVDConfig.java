package com.poscoict.container.config.videosystem.mixing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poscoict.container.videosystem.Avengers;
import com.poscoict.container.videosystem.BlankDisc;
import com.poscoict.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDConfig {

	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}
	
	@Bean(name="avangersInfinityWar")
	public DigitalVideoDisc blankDisc() {
		BlankDisc dvd = new BlankDisc();
		
		dvd.setTitle("Avangers Infinity War");
		dvd.setStudio("MARVEL");
		
		return dvd;
	}
	
}
