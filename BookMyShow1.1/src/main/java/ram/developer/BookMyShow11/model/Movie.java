package ram.developer.BookMyShow11.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ram.developer.BookMyShow11.model.constant.MovieFeature;

import java.util.List;
@Setter
@Getter
@Entity
public class Movie extends BaseModel{
    private String name;
    private String description;
    @ManyToMany
    private List<Actor> actors;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature>movieFeatures;
}
