package ram.developer.BookMyShow11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ram.developer.BookMyShow11.model.Movie;



public interface MovieRepository extends JpaRepository<Movie,Integer> {
}