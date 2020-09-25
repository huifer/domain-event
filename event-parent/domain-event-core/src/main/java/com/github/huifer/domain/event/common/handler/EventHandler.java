package com.github.huifer.domain.event.common.handler;


import com.github.huifer.domain.event.common.model.event.BaseEvent;

public interface EventHandler<E extends BaseEvent> {
	void handler(E event);

	Class<?> eventType();
}
