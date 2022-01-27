package com.poscoict.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	// join point setting, 접근지시자 + 전체 패키지 객체 + 전체 패키지 메서드(파라미터)
	@Before("execution(public com.poscoict.aoptest.vo.ProductVo com.poscoict.aoptest.service.ProductService.find(String))")
	public void beforeAdvice() {
		System.out.println("-- BeforeAdvice --");
	}
	
	@After("execution(* *..*.ProductService.find(..))")
	public void afterAdvice() {
		System.out.println("-- AfterAdvice --");
	}
	
	@AfterReturning("execution(* *..*.ProductService.*(..))")
	public void afterReturningAdvice() {
		System.out.println("-- AfterReturning Advice -- ");
	}
	
	@AfterThrowing(value="execution(* *..*.ProductService.*(..))", throwing="exception")
	public void afterThrowingAdvice(Throwable exception) {
		System.out.println("-- AfterThrowing Advice --  | " + exception);
	}
	
	@Around("execution(* *..*.ProductService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		// before
		System.out.println("-- Around(Before) Advice --");
		
		// PointCut Method 실행
		// 파라미터 변경
		Object[] params = {"Camera"};
		Object result = pjp.proceed(params); 
		
		// after
		System.out.println("-- Around(After) Advice --");
		
		return result;
	}
	
}
