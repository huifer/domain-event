package com.github.huifer.domain.event.sb.entity;

import com.github.huifer.domain.event.model.event.AbstractEvent;
import com.github.huifer.domain.event.sb.event.CreateUserEvent;
import com.github.huifer.domain.event.sb.event.UpdateUserEvent;

public class UserEntity extends AbstractEvent {

	private String name;

	public static UserEntity Create(String name) {
		UserEntity userEntity = new UserEntity();
		userEntity.name = name;
		userEntity.registerEvent(new CreateUserEvent(name));
		return userEntity;
	}

	public UserEntity update(String name) {
		this.name = name;
		this.cleanEvents();
		this.registerEvent(new UpdateUserEvent());
		return this;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
