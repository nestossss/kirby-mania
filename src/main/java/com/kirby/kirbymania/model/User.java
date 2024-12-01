package com.kirby.kirbymania.model;

import com.kirby.kirbymania.util.TipoUsuario;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "client")
    private List<Order> orders;

    private String name;
    private String email;
    private String password;
    private TipoUsuario tipoUsuario;

    public TipoUsuario getUserType() {
        return tipoUsuario;
    }

    public void setUserType(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public Integer getId() {
        return id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
