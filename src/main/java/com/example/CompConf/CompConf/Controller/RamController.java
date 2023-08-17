package com.example.CompConf.CompConf.Controller;

import com.example.CompConf.CompConf.Menage.RamMng;
import com.example.CompConf.CompConf.Model.Led;
import com.example.CompConf.CompConf.Model.RamMemory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/rams")
public class RamController {
    private Logger logger = LoggerFactory.getLogger(LoggerFactory.class);
    private RamMng ramMng;

    @Autowired
    public RamController(RamMng ramMng) {
        this.ramMng = ramMng;
    }


    @GetMapping("/get-all-rams")
    public Iterable<RamMemory> getAllRams(){logger.warn("Getting all the Leds");return ramMng.findAll();
    }
    @GetMapping("/get-ram-by-id")
    public Optional<RamMemory> getRamByid(@RequestParam Long id){
        return ramMng.findByRamId(id);
    }

    @PostMapping
    public RamMemory addNewRam(@RequestBody RamMemory ramMemory){
        return ramMng.add(ramMemory);
    }

    @PatchMapping
    public RamMemory addNewPatch(@RequestBody RamMemory ramMemory){
        return ramMng.add(ramMemory);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id){
        ramMng.delete(id);
    }
}
