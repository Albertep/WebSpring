package TutorialWeb.WebSpring.Repositories;

import TutorialWeb.WebSpring.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
