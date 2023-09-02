package com.example.CompConf.CompConf.Model.DTO;

import com.example.CompConf.CompConf.Model.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ComputerDTO {
    private String nameOfBuild;
    private Processor processor;
    private Motherboard motherboard;
    private GraphicsCard graphicsCard;
    private RamMemory ramMemory;
    private PowerSupply powerSupply;
    private Box box;
    private Led led;
    private Storage storage;

    public ComputerDTO(String nameOfBuild, Processor processor, Motherboard motherboard, GraphicsCard graphicsCard, RamMemory ramMemory, PowerSupply powerSupply, Box box, Led led, Storage storage) {
        this.nameOfBuild = nameOfBuild;
        this.processor = processor;
        this.motherboard = motherboard;
        this.graphicsCard = graphicsCard;
        this.ramMemory = ramMemory;
        this.powerSupply = powerSupply;
        this.box = box;
        this.led = led;
        this.storage = storage;
    }

    public ComputerDTO() {
    }

    public String getNameOfBuild() {
        return nameOfBuild;
    }

    public void setNameOfBuild(String nameOfBuild) {
        this.nameOfBuild = nameOfBuild;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public RamMemory getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(RamMemory ramMemory) {
        this.ramMemory = ramMemory;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public Led getLed() {
        return led;
    }

    public void setLed(Led led) {
        this.led = led;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
