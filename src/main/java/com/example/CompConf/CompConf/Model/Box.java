package com.example.CompConf.CompConf.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "box")
public class Box{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long ID;
    /*
     Do more specification laterrr // done in documentation
     */

    private String brand;

    private String model;
    private double price;
    private boolean avaliability;
    private short rates;

    public Box() {
    }

    public Box(Long ID, String brand, String model, double price, boolean avaliability, short rates) {
        this.ID = ID;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.avaliability = avaliability;
        this.rates = rates;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvaliability() {
        return avaliability;
    }

    public void setAvaliability(boolean avaliability) {
        this.avaliability = avaliability;
    }

    public short getRates() {
        return rates;
    }

    public void setRates(short rates) {
        this.rates = rates;
    }
}
