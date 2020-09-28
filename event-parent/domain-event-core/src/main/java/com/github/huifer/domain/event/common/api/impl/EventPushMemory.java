package com.github.huifer.domain.event.common.api.impl;

import java.util.List;
import java.util.Map;

import com.github.huifer.domain.event.api.EventHandler;
import com.github.huifer.domain.event.api.EventPush;
import com.github.huifer.domain.event.common.util.Container;
import com.github.huifer.domain.event.model.event.BaseEvent;

public class EventPushMemory implements EventPush {
	@Override
	public void push(BaseEvent baseEvent) {
		Map<Class<? extends BaseEvent>, List<EventHandler<BaseEvent>>> event = Container.event();
		List<EventHandler<BaseEvent>> eventHandlers = event.get(baseEvent.getClass());
		for (EventHandler<BaseEvent> eventHandler : eventHandlers) {
			eventHandler.handler(baseEvent);
		}
	}
}
