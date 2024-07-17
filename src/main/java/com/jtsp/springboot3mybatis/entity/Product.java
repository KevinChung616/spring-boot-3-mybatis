package com.jtsp.springboot3mybatis.entity;

import lombok.Data;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 1931623112312L;

    private Long id;

    private String name;

    private Integer quantity;

    public Product(Long id, String name, Integer quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
