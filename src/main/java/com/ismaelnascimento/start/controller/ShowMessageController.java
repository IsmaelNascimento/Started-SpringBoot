package com.ismaelnascimento.start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowMessageController {
	
	@RequestMapping("/")
	public String IndexPage() {
		return "My index";
	}

	@RequestMapping("/message")
	public String ShowMessage() {
		return "My message";
	}
	
}
