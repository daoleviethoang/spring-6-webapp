package guru.springframework.spring6webapp.repository;

import guru.springframework.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Author, Long> {
}