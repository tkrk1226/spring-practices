package com.poscoict.container.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.poscoict.container.config.user.AppConfig01;
import com.poscoict.container.user.User;

public class AppConfigTest {

	public static void main(String[] args) {
		testAppConfig01();
	}

	// Java Config
	// 직접 자바 클래스(config class)를 전달
	private static void testAppConfig01() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig01.class);
	
		User user = ac.getBean(User.class);
		System.out.println(user);
	
	}

}
