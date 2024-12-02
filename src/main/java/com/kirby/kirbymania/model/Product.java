package com.kirby.kirbymania.model;

import com.kirby.kirbymania.util.CategoriaProduto;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderList;

    private String nome;
    private Float price;
    private Integer estoque;
    private CategoriaProduto categoria;

    @CreationTimestamp
    private Instant create_time;

    @UpdateTimestamp
    private Instant update_time;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Instant getCreate_time() {
        return create_time;
    }

    public Instant getUpdate_time() {
        return update_time;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public Integer getId() {
        return id;
    }

    public List<OrderItem> getOrderList() {
        return orderList;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public void setOrderList(List<OrderItem> orderList) {
        this.orderList = orderList;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }
}

