package ram.developer.BookMyShow11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ram.developer.BookMyShow11.model.Seat;

public interface SeatRepository extends JpaRepository<Seat,Integer> {
}
