package pl.coderslab.warsztaty6.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.warsztaty6.entity.User;
import pl.coderslab.warsztaty6.repository.UserRepository;

@Controller
@RequestMapping(path="/test")
public class TestController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/")
	public String getAllUsers(Model model) {

		return "test/test";
	}
	
	@ModelAttribute("userItems")
	public Collection<User> getUserItems(){
		return (Collection<User>) userRepository.findAll();
	}
	
}
