package com.example.CompConf.CompConf.Menage;

import com.example.CompConf.CompConf.Model.Box;
import com.example.CompConf.CompConf.Model.Computer;
import com.example.CompConf.CompConf.Model.Repos.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class BoxMng {
    private BoxRepository boxRepository;

    @Autowired
    public BoxMng(BoxRepository boxRepository) {
        this.boxRepository = boxRepository;
    }

    public Iterable<Box> findAll(){
        return boxRepository.findAll();
    }
    public Optional<Box> findByBoxId(@RequestParam Long id){
        return boxRepository.findById(id);
    }

    public Box add(Box box){
        return boxRepository.saveAndFlush(box);
    }

    public Box addPatch(Box box){
        return boxRepository.saveAndFlush(box);
    }

    public void delete(Long id){
        boxRepository.deleteById(id);
    }

}
