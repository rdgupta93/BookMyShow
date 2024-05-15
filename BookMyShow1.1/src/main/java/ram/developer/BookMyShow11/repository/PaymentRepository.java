package ram.developer.BookMyShow11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ram.developer.BookMyShow11.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
