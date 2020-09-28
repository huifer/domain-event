package com.github.huifer.domain.event.center.service.impl;

import com.github.huifer.domain.event.api.HealthyApi;

import org.springframework.stereotype.Service;

@Service("healthyEventCenterService")
public class HealthyEventCenterService implements HealthyApi {

	@Override
	public boolean ping() {
		return true;
	}
}
