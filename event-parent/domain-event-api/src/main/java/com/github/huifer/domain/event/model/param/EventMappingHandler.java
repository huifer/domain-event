package com.github.huifer.domain.event.model.param;

import java.util.Objects;

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

	@Override
	public boolean equals(Object o) {
		if (this == o) { return true;}

		if (o == null || getClass() != o.getClass()) { return false;}

		EventMappingHandler that = (EventMappingHandler) o;
		return Objects.equals(baseEvent, that.baseEvent) &&
				Objects.equals(eventHandler, that.eventHandler);
	}

	@Override
	public int hashCode() {
		return Objects.hash(baseEvent, eventHandler);
	}
}
