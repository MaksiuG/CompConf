package com.example.CompConf.CompConf.Controller;

import com.example.CompConf.CompConf.Menage.CompMng;
import com.example.CompConf.CompConf.Menage.ProcessorMng;
import com.example.CompConf.CompConf.Model.Computer;
import com.example.CompConf.CompConf.Model.Repos.CompRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/comps")
public class CompController {

    private CompMng compMng;
    private Logger logger = LoggerFactory.getLogger(LoggerFactory.class);


    @Autowired
    public CompController(CompMng compMng) {
        this.compMng = compMng;

    }

    public CompController() {
    }

    @GetMapping("/get-all-computers")
    public Iterable<Computer> getAllComps(){logger.warn("Getting all the computers");return compMng.findAll();
    }
    @GetMapping("/get-computer-by-id")
    public Optional<Computer> getCompByid(@RequestParam Long id){
        return compMng.findByComputerId(id);
    }

    @PostMapping
    public Computer addNewComp(@RequestBody Computer computer){
        return compMng.add(computer);
    }

    @PatchMapping
    public Computer addNewPatch(@RequestBody Computer computer){
        return compMng.add(computer);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id){
        compMng.delete(id);
    }



}
