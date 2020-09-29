package com.github.huifer.domain.event.common.api.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.huifer.domain.event.api.EventHandler;
import com.github.huifer.domain.event.api.EventHandlerAppApi;
import com.github.huifer.domain.event.model.event.BaseEvent;
import com.github.huifer.domain.event.model.param.EventHandlerAppRegisterParam;
import com.github.huifer.domain.event.model.param.EventMappingHandler;

/**
 * register in memory
 */
public class EventHandlerRegisterInMemory implements EventHandlerAppApi {
	protected Map<EventHandlerAppRegisterParam, List<EventMappingHandler>> map = new HashMap<>();

	@Override
	public boolean register(EventHandlerAppRegisterParam handlerAppRegisterParam, EventMappingHandler eventMappingHandler) {
		List<EventMappingHandler> eventMappingHandlers = map.get(handlerAppRegisterParam);
		if (eventMappingHandlers == null) {
			eventMappingHandlers = new ArrayList<>();
		}
		eventMappingHandlers.add(eventMappingHandler);
		map.put(handlerAppRegisterParam, eventMappingHandlers);
		return true;
	}

	@Override
	public List<EventMappingHandler> info(EventHandlerAppRegisterParam handlerAppRegisterParam) {
		return map.get(handlerAppRegisterParam) == null ? Collections.emptyList() : map.get(handlerAppRegisterParam);
	}

	@Override
	public <T extends BaseEvent> EventHandler getByEvent(Class<T> eventClass) {
		List<EventMappingHandler> ev = new ArrayList<>();

		for (List<EventMappingHandler> value : map.values()) {
			ev.addAll(value);
		}

		for (EventMappingHandler eventMappingHandler : ev) {
			if (eventMappingHandler.getBaseEvent().getClass().equals(eventClass)) {
				return eventMappingHandler.getEventHandler();
			}
		}
		return null;
	}
}
