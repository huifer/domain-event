package com.github.huifer.domain.event.sb.service;

import org.junit.Test;

public class UserServiceTest {


	@Test
	public void createUser() {
		UserService userService = new UserService();
		userService.createUser("张三");
	}
}