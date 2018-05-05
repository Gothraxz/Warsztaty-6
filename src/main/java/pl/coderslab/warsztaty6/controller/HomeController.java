package pl.coderslab.warsztaty6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.warsztaty6.entity.Tweet;
import pl.coderslab.warsztaty6.repository.TweetRepository;

@Controller
@RequestMapping(path="/tweeter/home")
public class HomeController {
	
	@Autowired
	private TweetRepository tweetRepository;

//	@ModelAttribute("tweetItems")
//	public Collection<Tweet> getUserItems(){
//		return (Collection<Tweet>) tweetRepository.findAll();
//	}
	
	@ModelAttribute("tweetItems")
	public List<Tweet> getUserItems(){
		return tweetRepository.findAllByOrderByCreatedDesc();
	}
	
	@GetMapping(path="/")
	public String getAllTweets(Model model) {

		return "index";
	}
	
}
