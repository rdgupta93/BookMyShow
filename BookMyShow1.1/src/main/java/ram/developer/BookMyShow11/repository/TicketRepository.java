package ram.developer.BookMyShow11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ram.developer.BookMyShow11.model.Ticket;


public interface TicketRepository extends JpaRepository<Ticket,Integer> {

}
