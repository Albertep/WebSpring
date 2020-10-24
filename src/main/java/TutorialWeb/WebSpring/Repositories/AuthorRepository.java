package TutorialWeb.WebSpring.Repositories;

import TutorialWeb.WebSpring.domain.Authorr;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
