package com.example.CompConf.CompConf.Controller;

import com.example.CompConf.CompConf.Menage.PowerSupplyMng;
import com.example.CompConf.CompConf.Model.Led;
import com.example.CompConf.CompConf.Model.PowerSupply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/powersupplys")
public class PowerSupplyController {
    private Logger logger = LoggerFactory.getLogger(LoggerFactory.class);
    private PowerSupplyMng powerSupplyMng;

    @Autowired
    public PowerSupplyController(PowerSupplyMng powerSupplyMng) {
        this.powerSupplyMng = powerSupplyMng;
    }

    @GetMapping("/get-all-powersupply")
    public Iterable<PowerSupply> getAllLeds(){logger.warn("Getting all the powersupplys");return powerSupplyMng.findAll();
    }
    @GetMapping("/get-powersupply-by-id")
    public Optional<PowerSupply> getPowerSupplysByid(@RequestParam Long id){
        return powerSupplyMng.findByPowerSupplyId(id);
    }

    @PostMapping
    public PowerSupply addNewPowersupply(@RequestBody PowerSupply powerSupply){
        return powerSupplyMng.add(powerSupply);
    }

    @PatchMapping
    public PowerSupply addNewPatch(@RequestBody PowerSupply powerSupply){
        return powerSupplyMng.add(powerSupply);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id){
        powerSupplyMng.delete(id);
    }
}
