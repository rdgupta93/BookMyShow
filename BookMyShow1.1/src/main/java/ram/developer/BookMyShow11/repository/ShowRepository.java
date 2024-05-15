package ram.developer.BookMyShow11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ram.developer.BookMyShow11.model.Show;

public interface ShowRepository extends JpaRepository<Show,Integer> {
}
