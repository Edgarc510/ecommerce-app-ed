package com.myproject.entity;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;

}
