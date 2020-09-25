package com.github.huifer.domain.event.common.api;

import com.github.huifer.domain.event.common.model.event.BaseEvent;

public interface EventRepo {
	void save(BaseEvent baseEvent);

}
