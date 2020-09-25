package com.github.huifer.domain.event.sb.handler;

import com.github.huifer.domain.event.common.handler.EventHandler;
import com.github.huifer.domain.event.sb.event.CreateUserEvent;

import org.springframework.stereotype.Service;

@Service
public class CreateUserEventHandler implements EventHandler<CreateUserEvent> {

	@Override
	public void handler(CreateUserEvent event) {
		System.out.println("创建用户事件" + event.name);
	}

	@Override
	public Class<?> eventType() {
		return CreateUserEvent.class;
	}
}
