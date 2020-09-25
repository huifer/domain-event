package com.github.huifer.domain.event.sb.event;

import com.github.huifer.domain.event.common.model.BaseEvent;

public class CreateUserEvent extends BaseEvent {
	public String name;

	public CreateUserEvent(String name) {
		super();
		this.name = name;
	}
}
