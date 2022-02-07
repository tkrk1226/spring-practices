package com.poscoict.container.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poscoict.container.user.User;
import com.poscoict.container.user.User1;

public class XmlConfigTest {
	public static void main(String[] args) {
		
		// xml Auto Configuration (Annotation Scanning)
//		testBeanFactory01();
		
		// xml Bean Configuration (Explicit Configuration)
//		testBeanFactory02();
		
		// xml Auto Configuration (Annotation Scanning)
//		testApplicationContext01();
		
		// xml Bean Configuration (Explicit Configuration)
		testApplicationContext02();
		
	}
	
	// xml Auto Configuration (Annotation Scanning)
	private static void testApplicationContext01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/poscoict/container/config/user/applicationContext01.xml");

		User1 user1 = ac.getBean(User1.class);
		System.out.println(user1.getName());
		
		// id로 가져오기
		// bean id가 자동으로 설정됨
		User1 user2 = (User1)ac.getBean("user1");
		System.out.println(user2.getName());
		
	}	

	// xml Bean Configuration (Explicit Configuration)
	private static void testApplicationContext02() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/poscoict/container/config/user/applicationContext02.xml");

		User user = null;
		// id로 Bean 가져오기
		user = (User)ac.getBean("user");
		System.out.println(user);
		
		// parameter 1개
		user = (User)ac.getBean("user2");
		System.out.println(user);
		
		// parameter 2개
		user = (User)ac.getBean("user3");
		System.out.println(user);
		
		// parameter 2개, index
		user = (User)ac.getBean("user4");
		System.out.println(user);
		
		// setter를 사용한 Bean 가져오기 1
		user = (User)ac.getBean("user5");
		System.out.println(user);
		
		// setter를 사용한 Bean 가져오기 2(DI)
		user = (User)ac.getBean("user6");
		System.out.println(user);
		
		// setter를 사용한 Bean 가져오기 3(List Property)
		user = (User)ac.getBean("user7");
		System.out.println(user);
		
		// name으로 Bean 가져오기
		user = (User)ac.getBean("usr");
		System.out.println(user);
		
		// type으로 Bean 가져오기
		// 같은 타입의 Bean이 2개 이상 있으면 Exception(NoUnique)
		// type으로 가져오기는 실패함
		// user = ac.getBean(User.class)
		// 1. id, type
		// 2. name, type
//		System.out.println(user);
		
		
	}	
	
//	// xml Auto Configuration (Annotation Scanning)
//	private static void testBeanFactory01() {
//		BeanFactory bf = 
//				new XmlBeanFactory
//				(new ClassPathResource
//						("com/poscoict/container/config/user/applicationContext01.xml"));
//
//		User1 user1 = bf.getBean(User1.class);
//		System.out.println(user1.getName());
//		
//		// id로 가져오기
//		// bean id가 자동으로 설정됨
//		User1 user2 = (User1)bf.getBean("user1");
//		System.out.println(user2.getName());
//		
//	}
//	
//	// xml Bean Configuration (Explicit Configuration)
//	private static void testBeanFactory02() {
//		BeanFactory bf = 
//				new XmlBeanFactory
//				(new ClassPathResource
//						("com/poscoict/container/config/user/applicationContext02.xml"));
//
//		User1 user1 = bf.getBean(User1.class);
//		System.out.println(user1.getName());
//		
//		// Bean id가 자동으로 설정되지 않음
//		// 명시적으로 설정해야 한다.
//		user1 = (User1)bf.getBean("user1");
//		System.out.println(user1.getName());
//	}
	
	
}
