package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.*;


@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;


}