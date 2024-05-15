package ram.developer.BookMyShow11.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import ram.developer.BookMyShow11.model.constant.SeatStatus;
import ram.developer.BookMyShow11.model.constant.SeatType;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    private int row;
    private int column;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;

}
