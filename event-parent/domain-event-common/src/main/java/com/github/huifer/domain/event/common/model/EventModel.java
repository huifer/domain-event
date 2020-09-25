package com.github.huifer.domain.event.common.model;

import java.time.LocalDateTime;
import java.util.UUID;


public abstract class EventModel {
	private final String uid;

	private final LocalDateTime localDateTime;

	public EventModel() {
		this.uid = UUID.randomUUID().toString();
		this.localDateTime = LocalDateTime.now();
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public String getUid() {
		return uid;
	}
}
