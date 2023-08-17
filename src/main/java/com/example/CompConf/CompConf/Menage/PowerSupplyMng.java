package com.example.CompConf.CompConf.Menage;

import com.example.CompConf.CompConf.Model.Led;
import com.example.CompConf.CompConf.Model.PowerSupply;
import com.example.CompConf.CompConf.Model.Repos.PowerSupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class PowerSupplyMng {

   private PowerSupplyRepository powerSupplyRepository;

   @Autowired
    public PowerSupplyMng(PowerSupplyRepository powerSupplyRepository) {
        this.powerSupplyRepository = powerSupplyRepository;
    }

    public Iterable<PowerSupply> findAll(){
        return powerSupplyRepository.findAll();
    }

    public Optional<PowerSupply> findByPowerSupplyId(@RequestParam Long id){
        return powerSupplyRepository.findById(id);
    }

    public PowerSupply add(PowerSupply powerSupply){
        return powerSupplyRepository.saveAndFlush(powerSupply);
    }

    public PowerSupply addPatch(PowerSupply powerSupply){
        return powerSupplyRepository.save(powerSupply);
    }

    public void delete(Long id){
        powerSupplyRepository.deleteById(id);
    }
}
