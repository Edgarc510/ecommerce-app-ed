package com.myproject.entity;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Data
@NoArgsConstructor
public class Balance {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;

    private BigDecimal amount;

    @OneToOne
    private Customer customer;
}
