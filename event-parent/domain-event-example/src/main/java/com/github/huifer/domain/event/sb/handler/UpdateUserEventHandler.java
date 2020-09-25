package com.github.huifer.domain.event.sb.handler;

import com.github.huifer.domain.event.common.handler.EventHandler;
import com.github.huifer.domain.event.sb.event.UpdateUserEvent;


public class UpdateUserEventHandler implements EventHandler<UpdateUserEvent> {
	@Override
	public Class<?> eventType() {
		return UpdateUserEvent.class;
	}

	@Override
	public void handler(UpdateUserEvent event) {

		System.out.println("更新用户事件");
	}
}
