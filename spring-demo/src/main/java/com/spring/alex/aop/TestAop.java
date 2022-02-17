package com.spring.alex.aop;

import com.spring.alex.aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfigAop.class);
		UserService userService = applicationContext.getBean(UserService.class);
//        UserService userService = (UserService) applicationContext.getBean("userService");
		userService.query();
	}
}
