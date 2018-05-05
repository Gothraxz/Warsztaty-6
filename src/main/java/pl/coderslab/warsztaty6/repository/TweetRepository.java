package pl.coderslab.warsztaty6.repository;

import org.springframework.data.repository.CrudRepository;

import pl.coderslab.warsztaty6.entity.Tweet;

public interface TweetRepository extends CrudRepository<Tweet, Long>{

}
