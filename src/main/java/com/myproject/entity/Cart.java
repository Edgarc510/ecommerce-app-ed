package com.myproject.entity;

import com.myproject.enums.CartState;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Cart extends BaseEntity{

    @Enumerated(value = EnumType.STRING)
    private CartState cartState;


    @ManyToOne
    private Discount discount;

    @ManyToOne
    private Customer customer;


}
