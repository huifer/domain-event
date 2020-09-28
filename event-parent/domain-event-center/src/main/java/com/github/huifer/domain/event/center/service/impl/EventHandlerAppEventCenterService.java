package com.github.huifer.domain.event.center.service.impl;

import com.github.huifer.domain.event.api.EventHandlerAppApi;
import com.github.huifer.domain.event.center.ex.DomainEventRuntimeException;
import com.github.huifer.domain.event.model.param.EventHandlerAppRegisterParam;
import com.github.huifer.domain.event.model.param.EventMappingHandler;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service("eventHandlerAppEventCenterService")
public class EventHandlerAppEventCenterService implements EventHandlerAppApi {

	@Override
	public boolean register(EventHandlerAppRegisterParam handlerAppRegisterParam, EventMappingHandler eventMappingHandler) {

		String handlerAppHost = handlerAppRegisterParam.getHost();
		String handlerAppName = handlerAppRegisterParam.getName();
		int handlerAppPort = handlerAppRegisterParam.getPort();

		// check param
		checkEventHandlerAppRegisterParam(handlerAppHost, handlerAppName, handlerAppPort);


		// todo: 2020/9/28 save in mysql


		return false;
	}

	private void checkEventHandlerAppRegisterParam(String handlerAppHost, String handlerAppName, int handlerAppPort) {
		if (StringUtils.isEmpty(handlerAppHost)) {
			throw new DomainEventRuntimeException("register event handler app host is null !");
		}

		if (StringUtils.isEmpty(handlerAppName)) {
			throw new DomainEventRuntimeException("register event handler app name is null !");
		}
		if (handlerAppPort < 0) {
			throw new DomainEventRuntimeException("register event handler port < 0 !");
		}
	}


	@Override
	public Object info(EventHandlerAppRegisterParam handlerAppRegisterParam) {
		checkEventHandlerAppRegisterParam(handlerAppRegisterParam.getHost(), handlerAppRegisterParam.getName(), handlerAppRegisterParam.getPort());
		// todo: query in mysql

		return null;
	}
}
