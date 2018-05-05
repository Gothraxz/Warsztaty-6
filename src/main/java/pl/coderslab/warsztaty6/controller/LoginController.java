package pl.coderslab.warsztaty6.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.warsztaty6.repository.UserRepository;

@Controller
@RequestMapping(path="/login")
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/")
	public String getUserTweets(Model model) {
		
		return "login/login";
	}

	@PostMapping(path="/")
	public String getUserTweets(@ModelAttribute String username, @ModelAttribute String password) {

//		To Do
		
		return "redirect:/home";
	}

}
