package ram.developer.BookMyShow11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ram.developer.BookMyShow11.model.Actor;

public interface ActorRepository extends JpaRepository<Actor,Integer> {
}
