package ram.developer.BookMyShow11.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import ram.developer.BookMyShow11.model.constant.PaymentMode;
import ram.developer.BookMyShow11.model.constant.PaymentStatus;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private LocalDateTime paymentType;
    private double amount;
    private String referenceId;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;


}
