package com.github.huifer.domain.event.api;

public interface HealthyApi {
	/**
	 * ping
	 * @param pingUrl ping url
	 * @return true: communication success , false: communication failure
	 */
	boolean ping(String pingUrl);

}
