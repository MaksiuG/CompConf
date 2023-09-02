package com.example.CompConf.CompConf.Model;

import jakarta.persistence.*;

@Table
@Entity(name = "storage")
public class Storage{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String brand;

    private String model;
    private double price;
    private boolean avaliability;
    private int rates;

    public Storage() {
    }

    public Storage(Long id, String brand, String model, double price, boolean avaliability, int rates) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.avaliability = avaliability;
        this.rates = rates;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getRates() {
        return rates;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }
}
