package com.transfersrealizationservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transfers")
public class TransferRealization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "sender_account")
    private String senderAccount;
    @Column(name = "recipient_account")
    private String recipientAccount;
    private String title;
    private BigDecimal amount;
}
