package com.spring.alex.aop.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Override
	public String query() {
		System.out.println("------------ yz ------------");
		return "------------ yz ------------";
	}
}
