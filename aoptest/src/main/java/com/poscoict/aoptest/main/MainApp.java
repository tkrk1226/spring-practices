package com.poscoict.aoptest.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poscoict.aoptest.service.ProductService;
import com.poscoict.aoptest.vo.ProductVo;

public class MainApp {

	public static void main(String[] args) {

		// Listener가 만드는 Application Context와 연결지어서 생각하자
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		
		// ps를 만들고 컨테이너에 달라고해서 TV를 찾고 출력하는 프로그램??
		ProductService ps = ac.getBean(ProductService.class);
//		System.out.println(ps);
		ProductVo vo = ps.find("TV");
		System.out.println(vo);
		
		((AbstractXmlApplicationContext)ac).close();
	}
}
