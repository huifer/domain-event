package com.github.huifer.domain.event.common.api.impl;

import java.util.List;

import com.github.huifer.domain.event.api.EventHandler;
import com.github.huifer.domain.event.api.EventHandlerAppApi;
import com.github.huifer.domain.event.model.event.BaseEvent;
import com.github.huifer.domain.event.model.param.EventHandlerAppRegisterParam;
import com.github.huifer.domain.event.model.param.EventMappingHandler;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EventHandlerRegisterInMemoryTest {
	private EventHandlerAppApi eventHandlerAppApi;

	@Before
	public void init() {
		eventHandlerAppApi = new EventHandlerRegisterInMemory();
	}

	@Test
	public void register() {
		EventHandlerAppRegisterParam registerParam = new EventHandlerAppRegisterParam(1, "localhost", "local");
		EventMappingHandler eventMappingHandler = new EventMappingHandler();
		eventMappingHandler.setBaseEvent(new TestEvent());
		eventMappingHandler.setEventHandler(new TestHandler());

		eventHandlerAppApi.register(registerParam, eventMappingHandler);
		List<EventMappingHandler> info = eventHandlerAppApi.info(registerParam);
		Assert.assertEquals(1, info.size());
		EventHandler<TestEvent> byEvent = eventHandlerAppApi.getByEvent(TestEvent.class);
		Assert.assertNotNull(byEvent);

	}


	protected class TestEvent extends BaseEvent {

		@Override
		protected String eventName() {
			return "test event ";
		}

	}

	protected class TestHandler implements EventHandler<TestEvent> {
		@Override
		public void handler(TestEvent event) {

		}

		@Override
		public Class<?> eventType() {
			return TestEvent.class;
		}
	}
}