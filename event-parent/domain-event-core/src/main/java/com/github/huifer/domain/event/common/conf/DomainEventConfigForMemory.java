package com.github.huifer.domain.event.common.conf;

import java.util.Set;

import com.github.huifer.domain.event.api.EventHandlerAppApi;
import com.github.huifer.domain.event.common.api.impl.EventHandlerRegisterInMemory;
import com.github.huifer.domain.event.model.param.EventHandlerAppRegisterParam;
import com.github.huifer.domain.event.model.param.EventMappingHandler;

public class DomainEventConfigForMemory extends HandlerConfig {
	private final EventHandlerAppApi eventHandlerAppApi = new EventHandlerRegisterInMemory();


	public void registerInMemory(Set<EventMappingHandler> list) {
		EventHandlerAppRegisterParam registerParam = new EventHandlerAppRegisterParam(this.getPort(), this.getIp(), this.getName());
		for (EventMappingHandler handler : list) {
			eventHandlerAppApi.register(registerParam, handler);
		}
	}
}
