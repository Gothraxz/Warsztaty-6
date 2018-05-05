package pl.coderslab.warsztaty6.repository;

import org.springframework.data.repository.CrudRepository;

import pl.coderslab.warsztaty6.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{

}
