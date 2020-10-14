package TutorialWeb.WebSpring.Repositories;

import TutorialWeb.WebSpring.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
