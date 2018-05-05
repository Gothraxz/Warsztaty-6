package pl.coderslab.warsztaty6.repository;

import org.springframework.data.repository.CrudRepository;

import pl.coderslab.warsztaty6.entity.Message;

public interface MessageRepository extends CrudRepository<Message, Long>{

}
