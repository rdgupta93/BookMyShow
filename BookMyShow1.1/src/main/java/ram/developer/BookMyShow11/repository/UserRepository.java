package ram.developer.BookMyShow11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ram.developer.BookMyShow11.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
