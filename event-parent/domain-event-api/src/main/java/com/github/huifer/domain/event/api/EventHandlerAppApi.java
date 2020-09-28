package com.github.huifer.domain.event.api;

import com.github.huifer.domain.event.model.param.EventHandlerAppRegisterParam;
import com.github.huifer.domain.event.model.param.EventMappingHandler;

public interface EventHandlerAppApi {
	/**
	 * register event handler app
	 * @param events events
	 * @return true: register success , false: register error
	 */
	boolean register(EventHandlerAppRegisterParam handlerAppRegisterParam, EventMappingHandler eventMappingHandler);

	Object info(EventHandlerAppRegisterParam handlerAppRegisterParam);

}
