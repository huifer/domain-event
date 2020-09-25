package com.github.huifer.domain.event.common.api;

import com.github.huifer.domain.event.common.model.BaseEvent;

public interface EventPush {
	void push(BaseEvent baseEvent);
}
