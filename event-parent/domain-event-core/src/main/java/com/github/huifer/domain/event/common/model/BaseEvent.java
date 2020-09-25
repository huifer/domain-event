package com.github.huifer.domain.event.common.model;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class BaseEvent {
	private final String uid;

	private final LocalDateTime createAt;

	public String getUid() {
		return uid;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public BaseEvent() {
		this.uid = UUID.randomUUID().toString();
		this.createAt = LocalDateTime.now();
	}
}
