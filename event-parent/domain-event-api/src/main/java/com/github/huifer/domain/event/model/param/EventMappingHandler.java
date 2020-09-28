package com.github.huifer.domain.event.model.param;

import java.util.List;

import com.github.huifer.domain.event.api.EventHandler;
import com.github.huifer.domain.event.model.event.BaseEvent;

public class EventMappingHandler {
	private BaseEvent baseEvent;

	private List<EventHandler> eventHandler;

	public BaseEvent getBaseEvent() {
		return baseEvent;
	}

	public void setBaseEvent(BaseEvent baseEvent) {
		this.baseEvent = baseEvent;
	}

	public List<EventHandler> getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(List<EventHandler> eventHandler) {
		this.eventHandler = eventHandler;
	}
}
