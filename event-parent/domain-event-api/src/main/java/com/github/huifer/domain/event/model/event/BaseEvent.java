package com.github.huifer.domain.event.model.event;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class BaseEvent {
	private final String uid;

	private final LocalDateTime createAt;

	public BaseEvent() {
		this.uid = UUID.randomUUID().toString();
		this.createAt = LocalDateTime.now();
	}

	protected abstract String eventName();

	public String getUid() {
		return uid;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}
}
