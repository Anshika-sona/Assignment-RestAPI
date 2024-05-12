package com.liveasy.model;

import javax.persistence.*;

@Entity
@Table(name = "transporters")
public class Transporter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    // Constructors, getters, and setters
}
