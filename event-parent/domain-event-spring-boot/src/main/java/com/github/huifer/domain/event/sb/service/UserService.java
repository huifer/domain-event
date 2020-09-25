package com.github.huifer.domain.event.sb.service;

import com.github.huifer.domain.event.common.api.EventPush;
import com.github.huifer.domain.event.common.api.impl.EventPushMemory;
import com.github.huifer.domain.event.sb.entity.UserEntity;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	EventPush eventPush = new EventPushMemory();

	public void createUser(String name) {
		UserEntity create = UserEntity.Create(name);
		create.getEvents().forEach(
				s -> {

					eventPush.push(s);
				}
		);
	}
}
