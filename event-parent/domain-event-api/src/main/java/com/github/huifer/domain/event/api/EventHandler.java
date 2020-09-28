package com.github.huifer.domain.event.api;


import com.github.huifer.domain.event.model.event.BaseEvent;

public interface EventHandler<E extends BaseEvent> {
	void handler(E event);

	Class<?> eventType();
}
