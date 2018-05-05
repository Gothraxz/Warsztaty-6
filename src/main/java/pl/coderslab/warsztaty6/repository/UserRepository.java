package pl.coderslab.warsztaty6.repository;

import org.springframework.data.repository.CrudRepository;

import pl.coderslab.warsztaty6.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
