package com.github.huifer.domain.event.center.controller;

import com.github.huifer.domain.event.common.model.register.RegisterParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/case")
public class RegisterController {

	@PostMapping("/register")
	public void register(
			@RequestBody RegisterParam registerParam
	) {
		System.out.println();
	}

	@GetMapping("/info")
	public void info() {

	}
}
