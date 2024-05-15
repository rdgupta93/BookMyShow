package ram.developer.BookMyShow11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ram.developer.BookMyShow11.model.City;

public interface CityRepository extends JpaRepository<City,Integer> {
}
