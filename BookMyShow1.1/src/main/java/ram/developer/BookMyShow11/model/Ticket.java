package ram.developer.BookMyShow11.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ram.developer.BookMyShow11.model.constant.TicketStatus;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@Entity

public class Ticket extends BaseModel{
    private LocalDateTime timeOfBooking;
    private double totalAmount;
    @OneToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;


}
