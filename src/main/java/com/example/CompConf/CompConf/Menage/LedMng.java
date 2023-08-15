package com.example.CompConf.CompConf.Menage;

import com.example.CompConf.CompConf.Model.GraphicsCard;
import com.example.CompConf.CompConf.Model.Led;
import com.example.CompConf.CompConf.Model.Repos.LedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class LedMng {

    private LedRepository ledRepository;

    @Autowired
    public LedMng(LedRepository ledRepository) {
        this.ledRepository = ledRepository;
    }

    public Iterable<Led> findAll(){
        return ledRepository.findAll();
    }
    public Optional<Led> findByLedrId(@RequestParam Long id){
        return ledRepository.findById(id);
    }

    public Led add(Led led){
        return ledRepository.saveAndFlush(led);
    }

    public Led addPatch(Led led){
        return ledRepository.save(led);
    }

    public void delete(Long id){
        ledRepository.deleteById(id);
    }
}
