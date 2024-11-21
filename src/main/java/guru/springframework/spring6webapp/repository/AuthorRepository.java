package guru.springframework.spring6webapp.repository;

import guru.springframework.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Book, Long> {
}
