package com.github.huifer.domain.event.api;

import java.util.List;

import com.github.huifer.domain.event.model.event.BaseEvent;

public interface EventHandlerAppApi {
	/**
	 * register event handler app
	 * @param host host
	 * @param port port
	 * @param events events
	 * @return true: register success , false: register error
	 */
	boolean register(String host, int port, List<? extends BaseEvent> events);

	Object info(String host, int port);
}
