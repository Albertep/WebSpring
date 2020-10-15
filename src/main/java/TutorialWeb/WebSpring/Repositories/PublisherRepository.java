package TutorialWeb.WebSpring.Repositories;

import TutorialWeb.WebSpring.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
