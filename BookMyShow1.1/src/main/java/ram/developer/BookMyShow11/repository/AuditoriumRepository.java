package ram.developer.BookMyShow11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ram.developer.BookMyShow11.model.Auditorium;

public interface AuditoriumRepository extends JpaRepository<Auditorium,Integer> {
}
