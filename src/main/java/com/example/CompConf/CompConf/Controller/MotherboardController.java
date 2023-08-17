package com.example.CompConf.CompConf.Controller;

import com.example.CompConf.CompConf.Menage.MotherboardMng;
import com.example.CompConf.CompConf.Model.Led;
import com.example.CompConf.CompConf.Model.Motherboard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/motherboards")
public class MotherboardController {
    private Logger logger = LoggerFactory.getLogger(LoggerFactory.class);
    private MotherboardMng motherboardMng;

    @Autowired
    public MotherboardController(MotherboardMng motherboardMng) {
        this.motherboardMng = motherboardMng;
    }

    @GetMapping("/get-all-motherboards")
    public Iterable<Motherboard> getAllMotherboards(){logger.warn("Getting all the Motherboard");return motherboardMng.findAll();
    }
    @GetMapping("/get-motherboards-by-id")
    public Optional<Motherboard> getMotherboardByid(@RequestParam Long id){
        return motherboardMng.findByMotherboardId(id);
    }

    @PostMapping
    public Motherboard addNewMotherboard(@RequestBody Motherboard motherboard){
        return motherboardMng.add(motherboard);
    }

    @PatchMapping
    public Motherboard addNewPatch(@RequestBody Motherboard motherboard){
        return motherboardMng.add(motherboard);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id){
        motherboardMng.delete(id);
    }
}
