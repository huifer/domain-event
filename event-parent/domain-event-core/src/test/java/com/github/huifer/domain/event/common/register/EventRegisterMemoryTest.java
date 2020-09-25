package com.github.huifer.domain.event.common.register;

import com.github.huifer.domain.event.common.handler.EventHandler;
import com.github.huifer.domain.event.common.model.event.BaseEvent;
import org.junit.Assert;
import org.junit.Before;

public class EventRegisterMemoryTest {
	EventRegister register;

	@Before
	public void init() {
		register = new EventRegisterMemory();
	}

	@org.junit.Test
	public void register() {
		BaseEvent baseEvent = new BaseEvent() {
		};
		EventHandler<BaseEvent> eventHandler = new EventHandler<BaseEvent>() {
			@Override
			public void handler(BaseEvent event) {

			}

			@Override
			public Class<?> eventType() {
				return null;
			}
		};
		register.register(baseEvent, eventHandler);
		Assert.assertTrue(register.map().size() == 1);
		Assert.assertTrue(register.map().get(baseEvent.getClass()).get(0).equals(eventHandler));
	}

	@org.junit.Test
	public void testRegister() {
	}
}