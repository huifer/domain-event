package com.github.huifer.domain.event.center.service;

import com.github.huifer.domain.event.common.model.register.RegisterParam;

public interface EventHandlerService {
	/**
	 * register event handling application
	 * @return true: register  success , false: register fail
	 */
	boolean register(RegisterParam param);


	/**
	 * get event handling application detail
	 * @param uid uid
	 * @return event handling application
	 */
	Object info(String uid);
}
