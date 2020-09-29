package com.github.huifer.domain.event.model.param;

import com.github.huifer.domain.event.api.EventHandler;
import com.github.huifer.domain.event.model.event.BaseEvent;

public class EventMappingHandler {
	private BaseEvent baseEvent;

	private EventHandler eventHandler;

	public BaseEvent getBaseEvent() {
		return baseEvent;
	}

	public void setBaseEvent(BaseEvent baseEvent) {
		this.baseEvent = baseEvent;
	}

	public EventHandler getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(EventHandler eventHandler) {
		this.eventHandler = eventHandler;
	}
}
