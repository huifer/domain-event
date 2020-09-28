package com.github.huifer.domain.event.common.util;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.github.huifer.domain.event.api.EventHandler;
import com.github.huifer.domain.event.model.event.BaseEvent;

public class Container {
	protected static Map<Class<? extends BaseEvent>, List<EventHandler<BaseEvent>>> handlers = new ConcurrentHashMap<>(64);

	private Container() {
		throw new IllegalStateException("Utility class");
	}

	public static Map<Class<? extends BaseEvent>, List<EventHandler<BaseEvent>>> event() {
		return handlers;
	}

}
