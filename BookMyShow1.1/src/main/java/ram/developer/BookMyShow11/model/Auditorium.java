package ram.developer.BookMyShow11.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ram.developer.BookMyShow11.model.constant.AuditoriumFeature;

import java.util.List;
@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat>seats;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeature>auditoriumFeatures;
}
