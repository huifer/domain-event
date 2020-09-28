package com.github.huifer.domain.event.api;

import java.util.List;

import com.github.huifer.domain.event.model.EventHandlerRegisterParam;
import com.github.huifer.domain.event.model.event.BaseEvent;

public interface EventHandlerAppApi {
	boolean register(String host, int port, List<? extends BaseEvent> events);
}
