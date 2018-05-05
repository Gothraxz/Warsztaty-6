package pl.coderslab.warsztaty6.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.warsztaty6.entity.User;
import pl.coderslab.warsztaty6.repository.MessageRepository;
import pl.coderslab.warsztaty6.repository.TweetRepository;
import pl.coderslab.warsztaty6.repository.UserRepository;

@Controller
@RequestMapping(path="/tweeter/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TweetRepository tweetRepository;
	
	@Autowired 
	private MessageRepository messageRepository;
	
	@ModelAttribute("userItems")
	public Collection<User> getUserItems(){
		return (Collection<User>) userRepository.findAll();
	}
	
	@GetMapping(path="/add")
	public String saveUser(Model model) {

		model.addAttribute("user", new User());

		return "users/addUser";
	}

	@PostMapping(path="/add")
	public String saveUser(@Valid @ModelAttribute User user, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "users/addUser";
		}
		// manualne hashowanie hasła - użyć Spring Boot Security do automatycznego hashowania
//		user.setPassword(hashPassword(user.getPassword()));
		
		userRepository.save(user);

		return "redirect:/home";
	}
	// koduje hasło
//	private String hashPassword(String plainTextPassword){
//		return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
//	}
	// sprawdza czy wprowadzone hasło zgadza się z zakodowanym
//	private void checkPass(String plainPassword, String hashedPassword) {
//		if (BCrypt.checkpw(plainPassword, hashedPassword))
//			System.out.println("The password matches.");
//		else
//			System.out.println("The password does not match.");
//	}
	
}
