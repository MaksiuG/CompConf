package com.example.CompConf.CompConf.Menage;

import com.example.CompConf.CompConf.Model.Led;
import com.example.CompConf.CompConf.Model.Motherboard;
import com.example.CompConf.CompConf.Model.Repos.MotherboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class MotherboardMng {

    private MotherboardRepository motherboardRepository;

    @Autowired
    public MotherboardMng(MotherboardRepository motherboardRepository) {
        this.motherboardRepository = motherboardRepository;
    }

    public Iterable<Motherboard> findAll(){
        return motherboardRepository.findAll();
    }
    public Optional<Motherboard> findByMotherboardId(@RequestParam Long id){
        return motherboardRepository.findById(id);
    }

    public Motherboard add(Motherboard motherboard){
        return motherboardRepository.saveAndFlush(motherboard);
    }

    public Motherboard addPatch(Motherboard motherboard){
        return motherboardRepository.save(motherboard);
    }

    public void delete(Long id){
        motherboardRepository.deleteById(id);
    }
}
