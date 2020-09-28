package com.github.huifer.domain.event.center.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/case")
public class RegisterController {

	/**
	 * register event handler service
	 */
	@PostMapping("/register")
	public void register(
	) {
	}


	@GetMapping("/info/{uid}")
	public void info(
			@PathVariable(value = "uid") String uid
	) {

	}
}
