package com.example.CompConf.CompConf.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name="computer")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)

    private Long id;

    @Column(name = "nameofbuild")

    private String nameOfBuild;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "processor_id")

    private Processor processor;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "motherboard_id")

    private Motherboard motherboard;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "graphics_card_id")

    private GraphicsCard graphicsCard;



    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ram_memory_id")

    private RamMemory ramMemory;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "power_supply_id")

    private PowerSupply powerSupply;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "box_id")

    private Box box;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "led_id")

    private Led led;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "storage_id")
    private Storage storage;

    public Computer() {
    }

    public Computer(Long id, String nameOfBuild, Processor processor, Motherboard motherboard, GraphicsCard graphicsCard, RamMemory ramMemory, PowerSupply powerSupply, Box box, Led led, Storage storage) {
        this.id = id;
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

    public Led getLed() {
        return led;
    }

    public Box getBox() {
        return box;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public RamMemory getRamMemory() {
        return ramMemory;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNameOfBuild(String nameOfBuild) {
        this.nameOfBuild = nameOfBuild;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setRamMemory(RamMemory ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public void setLed(Led led) {
        this.led = led;
    }

    public String getNameOfBuild() {
        return nameOfBuild;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
