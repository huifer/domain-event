package com.github.huifer.domain.event.common.register;

import java.util.List;
import java.util.Map;

import com.github.huifer.domain.event.common.handler.EventHandler;
import com.github.huifer.domain.event.common.model.BaseEvent;
import com.github.huifer.domain.event.common.util.Container;

public interface EventRegister {


	default List<EventHandler<BaseEvent>> getHandlerList(Class<? extends BaseEvent> eventClass) {
		return Container.event().get(eventClass);
	}

	default Map<Class<?>, List<EventHandler<BaseEvent>>> map() {
		return Container.event();
	}

	void register(BaseEvent event, List<EventHandler<? extends BaseEvent>> eventHands);


	void register(Class<?> eventClass, EventHandler<? extends BaseEvent> handler);

	void register(BaseEvent event, EventHandler<? extends BaseEvent> handler);
}
