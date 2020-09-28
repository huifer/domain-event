package com.github.huifer.domain.event.center.controller;

import com.github.huifer.domain.event.api.HealthyApi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
	private final HealthyApi healthyEventCenterService;

	public PingController(@Qualifier("healthyEventCenterService") HealthyApi healthyEventCenterService) {
		this.healthyEventCenterService = healthyEventCenterService;
	}


	@GetMapping("/ping")
	public Boolean ping() {
		return healthyEventCenterService.ping();
	}
}
