package com.myproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Address {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;

    private String name;
    private String street;
    private String zipCode;

    @ManyToOne
    private Customer customer;

}
