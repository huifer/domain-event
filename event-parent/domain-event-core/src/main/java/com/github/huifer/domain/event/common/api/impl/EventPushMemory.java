package com.github.huifer.domain.event.common.api.impl;

import java.util.List;
import java.util.Map;

import com.github.huifer.domain.event.common.api.EventPush;
import com.github.huifer.domain.event.common.handler.EventHandler;
import com.github.huifer.domain.event.common.model.BaseEvent;
import com.github.huifer.domain.event.common.util.Container;

public class EventPushMemory implements EventPush {
	@Override
	public void push(BaseEvent baseEvent) {
		Map<Class<?>, List<EventHandler<BaseEvent>>> event = Container.event();
		List<EventHandler<BaseEvent>> eventHandlers = event.get(baseEvent.getClass());
		for (EventHandler<BaseEvent> eventHandler : eventHandlers) {
			eventHandler.handler(baseEvent);
		}
	}
}
