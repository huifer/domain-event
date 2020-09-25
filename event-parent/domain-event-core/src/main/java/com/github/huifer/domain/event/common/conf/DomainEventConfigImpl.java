package com.github.huifer.domain.event.common.conf;

import com.github.huifer.domain.event.common.handler.EventHandler;
import com.github.huifer.domain.event.common.model.BaseEvent;
import com.github.huifer.domain.event.common.register.EventRegister;
import com.github.huifer.domain.event.common.register.EventRegisterMemory;

public abstract class DomainEventConfigImpl {

	/**
	 * 基于内存的事件注册器
	 */
	protected EventRegister eventRegister = new EventRegisterMemory();

	public abstract void conf();

	public void start() {
		conf();
	}

	protected void register(Class<?> eventClass, EventHandler<? extends BaseEvent> handler) {
		eventRegister.register(eventClass, handler);
	}

}
