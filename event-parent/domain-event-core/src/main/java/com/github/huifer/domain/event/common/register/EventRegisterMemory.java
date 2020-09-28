package com.github.huifer.domain.event.common.register;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.github.huifer.domain.event.api.EventHandler;
import com.github.huifer.domain.event.common.util.Container;
import com.github.huifer.domain.event.model.event.BaseEvent;

public class EventRegisterMemory {

	public void register(BaseEvent event, List<EventHandler<? extends BaseEvent>> eventHands) {

		List<EventHandler<BaseEvent>> eventHandlers = getObject().get(event.getClass());


		if (eventHandlers != null) {
			for (EventHandler<? extends BaseEvent> eventHand : eventHands) {

				eventHandlers.add((EventHandler<BaseEvent>) eventHand);
			}
		}
		else {
			eventHandlers = new ArrayList<>();
			for (EventHandler<? extends BaseEvent> eventHand : eventHands) {
				eventHandlers.add((EventHandler<BaseEvent>) eventHand);
			}
		}
		getObject().put(event.getClass(), eventHandlers);

	}

	private Map<Class<? extends BaseEvent>, List<EventHandler<BaseEvent>>> getObject() {
		return Container.event();
	}

	public void register(Class<? extends BaseEvent> eventClass, EventHandler<? extends BaseEvent> handler) {
		List<EventHandler<BaseEvent>> eventHandlers = getObject().get(eventClass);
		if (eventHandlers != null) {
			eventHandlers.add((EventHandler<BaseEvent>) handler);
		}
		else {

			eventHandlers = new ArrayList<>();
			eventHandlers.add((EventHandler<BaseEvent>) handler);
		}
		getObject().put(eventClass, eventHandlers);
	}

	public void register(BaseEvent event, EventHandler<? extends BaseEvent> handler) {
		List<EventHandler<BaseEvent>> eventHandlers = getObject().get(event.getClass());

		if (eventHandlers != null) {
			eventHandlers.add((EventHandler<BaseEvent>) handler);
		}
		else {
			eventHandlers = new ArrayList<>();
			eventHandlers.add((EventHandler<BaseEvent>) handler);
		}
		getObject().put(event.getClass(), eventHandlers);
	}

	public Map<Class<? extends BaseEvent>, List<EventHandler<BaseEvent>>> map() {
		return Container.event();
	}
}
