package com.example.CompConf.CompConf.Services;

import com.example.CompConf.CompConf.Menage.CompMng;
import com.example.CompConf.CompConf.Model.*;
import com.example.CompConf.CompConf.Model.Repos.CompRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {

    private CompMng compMng;

@Autowired
    public ComputerService(CompMng compMng) {
        this.compMng = compMng;
    }
    @EventListener(ApplicationReadyEvent.class)
    public void add(){
/*
        Computer computer = new Computer();
computer.setBox(new Box());
        computer.setBox(new Box(
                "SilentiumPC",
                "Master",
                169.99,
                true,
                (short)5,
                3L));
        computer.setGraphicsCard(new GraphicsCard("NVDIA","RTX 2080", 2599.99, true, (short) 7, 12L));
        computer.setProcessor(new Processor( "AMD","Ryzen 7 5500", 749.99, true, (short) 8, 34L));
        computer.setMotherboard(new Motherboard("ASUS","B450",549.99,true, (short) 7,54L));
        computer.setNameOfBuild("Krwawy Masturabtor 4000");
        computer.setPowerSupply(new PowerSupply("BanditPower","XD", 59.99 ,true, (short) 3, 45L));
        computer.setRamMemory(new RamMemory("GoodRam", "G-Skill", 189.99, true, (short) 8, 999L));
        computer.setLed(new Led("LedMaster","KQ199", 69.99, true, (short) 7, 3453L));
        compMng.add(computer);

 */



    }
}
