package com.github.huifer.domain.event.model.param;

import java.util.Objects;

public class EventHandlerAppRegisterParam {
	private int port;

	private String host;

	private String name;

	public EventHandlerAppRegisterParam() {
	}

	public EventHandlerAppRegisterParam(int port, String host, String name) {
		this.port = port;
		this.host = host;
		this.name = name;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) { return true;}
		if (o == null || getClass() != o.getClass()) { return false;}
		EventHandlerAppRegisterParam that = (EventHandlerAppRegisterParam) o;
		return port == that.port &&
				Objects.equals(host, that.host) &&
				Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(port, host, name);
	}
}
