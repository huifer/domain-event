package com.github.huifer.domain.event.sb.runner;

import java.util.Map;

import com.github.huifer.domain.event.common.handler.EventHandler;
import com.github.huifer.domain.event.common.register.EventRegister;
import com.github.huifer.domain.event.common.register.EventRegisterMemory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order
public class EventRegisterRunner implements CommandLineRunner {
	EventRegister eventRegister = new EventRegisterMemory();

	@Autowired
	private ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		Map<String, EventHandler> beansOfType = context.getBeansOfType(EventHandler.class);
		beansOfType.forEach(
				(k, v) -> {
					eventRegister.register(v.eventType(), v);
				}
		);
	}
}
