package com.marck.spring.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IndexController {
	@Value("${application.controller.mensaje}")
	private String mensaje;
	@GetMapping("/")
	public String Index(Model model) {
		model.addAttribute("mensaje", this.mensaje);
		return "index";
	}

}
