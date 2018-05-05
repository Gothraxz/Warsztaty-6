package pl.coderslab.warsztaty6.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pl.coderslab.warsztaty6.entity.Tweet;

public interface TweetRepository extends CrudRepository<Tweet, Long>{

	public List<Tweet> findAllByOrderByCreatedDesc();
	
}
