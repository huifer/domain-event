package com.github.huifer.domain.event.api;

import com.github.huifer.domain.event.model.event.BaseEvent;

public interface EventPush {
	void push(BaseEvent baseEvent);
}
