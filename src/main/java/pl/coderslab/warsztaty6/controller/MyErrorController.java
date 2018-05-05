package pl.coderslab.warsztaty6.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class MyErrorController implements ErrorController {
	
	@RequestMapping("/error")
	public String denied() {
		System.out.println("no error");
		return "redirect:/login/";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
}
