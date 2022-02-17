package com.spring.alex.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@EnableAspectJAutoProxy
@ComponentScan("com.spring.alex.aop")
@Component
@Aspect
public class AppConfigAop {

	public AppConfigAop() {
		System.out.println("----------------- AppConfigAop -----------------");
	}

	@Pointcut("execution(* com.spring.alex.aop.service.*.*(..))")
//	@Pointcut("execution(*  com.spring.alex.aop.service.UserService.query(..))")
	public void businessService() {
		System.out.println("----------------- businessService -----------------");
	}

	@Before(value = "businessService()")
	public void doBefore() {
		System.out.println("----------------- doBefore -----------------");
	}
	@AfterReturning(value = "businessService()")
	public void doAfterReturning() {
		System.out.println("----------------- doAfterReturning -----------------");
	}
	@After(value = "businessService()")
	public void doAfter() {
		System.out.println("----------------- doAfter -----------------");
	}
}
