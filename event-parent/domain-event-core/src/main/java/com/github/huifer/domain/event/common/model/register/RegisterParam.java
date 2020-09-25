package com.github.huifer.domain.event.common.model.register;

import java.util.List;
import java.util.Map;

import com.github.huifer.domain.event.common.handler.EventHandler;
import com.github.huifer.domain.event.common.model.event.BaseEvent;

public class RegisterParam {
	private String ipPort;

	private String name;

	Map<Class<?>, List<EventHandler<BaseEvent>>> handlers;

	public String getIpPort() {
		return ipPort;
	}

	public void setIpPort(String ipPort) {
		this.ipPort = ipPort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
