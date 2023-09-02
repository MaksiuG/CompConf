package com.example.CompConf.CompConf.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "processor")
public class Processor{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long ID;

    private String brand;

    private String model;
    private double price;
    private boolean avaliability;
    private int rates;

    /*
     Do more specification laterrr // done in documentation
     */

    public Processor() {

    }

    public Processor(Long ID, String brand, String model, double price, boolean avaliability, int rates) {
        this.ID = ID;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.avaliability = avaliability;
        this.rates = rates;
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

    public Long getId() {
        return ID;
    }

    public void setId(Long ID) {
        this.ID = ID;
    }




}
