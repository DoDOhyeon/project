package project.backend.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.backend.dto.PaymentDTO;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @Column
    private String paymentType;

    @Column
    private String paymentKey;

    @Column
    private Long amount;

    @Column
    private String orderName;

    @Column
    private String orderId;

    private boolean paySuccessYN;

    public PaymentDTO toPay

}
