package com.github.huifer.domain.event.center.ex;

public class DomainEventRuntimeException extends RuntimeException {
	public DomainEventRuntimeException() {
		super();
	}

	public DomainEventRuntimeException(String message) {
		super(message);
	}

	public DomainEventRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public DomainEventRuntimeException(Throwable cause) {
		super(cause);
	}

	protected DomainEventRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
