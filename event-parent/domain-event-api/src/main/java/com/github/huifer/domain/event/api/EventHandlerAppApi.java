package com.github.huifer.domain.event.api;

import java.util.List;

import com.github.huifer.domain.event.model.event.BaseEvent;
import com.github.huifer.domain.event.model.param.EventHandlerAppRegisterParam;
import com.github.huifer.domain.event.model.param.EventMappingHandler;

public interface EventHandlerAppApi {
	/**
	 * register event handler app
	 * @return true: register success , false: register error
	 */
	boolean register(EventHandlerAppRegisterParam handlerAppRegisterParam, EventMappingHandler eventMappingHandler);

	List<EventMappingHandler> info(EventHandlerAppRegisterParam handlerAppRegisterParam);


	<T extends BaseEvent> EventHandler<T>   getByEvent(Class<T> eventClass);
}
