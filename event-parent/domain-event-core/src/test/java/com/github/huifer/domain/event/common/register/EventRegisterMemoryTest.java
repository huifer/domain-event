package com.github.huifer.domain.event.common.register;

import com.github.huifer.domain.event.api.EventHandler;
import com.github.huifer.domain.event.model.event.BaseEvent;
import org.junit.Assert;
import org.junit.Before;

public class EventRegisterMemoryTest {
	EventRegisterMemory register;

	@Before
	public void init() {
		register = new EventRegisterMemory();
	}

	@org.junit.Test
	public void register() {
		BaseEvent baseEvent = new BaseEvent() {
			@Override
			protected String eventName() {
				return "test event";
			}
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