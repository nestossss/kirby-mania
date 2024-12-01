package com.kirby.kirbymania.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> productList;
}
