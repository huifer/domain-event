package com.github.huifer.domain.event.model.event;

import java.util.ArrayList;
import java.util.List;

public abstract class SuperEvent {
	private List<BaseEvent> events;

	protected final void registerEvent(BaseEvent event) {
		getEvents().add(event);
	}


	public final List<BaseEvent> getEvents() {
		if (events == null) {
			events = new ArrayList<>();
		}
		return events;
	}

	public final void cleanEvents() {
		getEvents().clear();
	}

}
