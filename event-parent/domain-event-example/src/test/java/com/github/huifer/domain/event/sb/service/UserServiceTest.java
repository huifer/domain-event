package com.github.huifer.domain.event.sb.service;

import com.github.huifer.domain.event.common.conf.DomainEventConfigImpl;
import com.github.huifer.domain.event.common.handler.EventHandler;
import com.github.huifer.domain.event.sb.event.CreateUserEvent;
import com.github.huifer.domain.event.sb.handler.CreateUserEventHandler;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTest extends DomainEventConfigImpl {
	@Override
	public void conf() {
		EventHandler<CreateUserEvent> createUserEventHandler = new CreateUserEventHandler();
		register(CreateUserEvent.class, createUserEventHandler);
	}

	@Before
	public void init() {
		start();
	}

	@Test
	public void createUser() {
		UserService userService = new UserService();
		userService.createUser("张三");
	}
}