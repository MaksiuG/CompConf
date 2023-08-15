package com.example.CompConf.CompConf.Controller;

import com.example.CompConf.CompConf.Menage.BoxMng;
import com.example.CompConf.CompConf.Menage.CompMng;
import com.example.CompConf.CompConf.Model.Box;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/boxes")
public class BoxController {
    private BoxMng boxMng;
    private Logger logger = LoggerFactory.getLogger(LoggerFactory.class);

    @Autowired
    public BoxController(BoxMng boxMng) {
        this.boxMng = boxMng;
    }


    @GetMapping("/get-all-boxes")
    public Iterable<Box> getAllBoxes(){logger.warn("Getting all the boxes");return boxMng.findAll();
    }
    @GetMapping("/get-boxes-by-id")
    public Optional<Box> getBoxByid(@RequestParam Long id){
        return boxMng.findByBoxId(id);
    }

    @PostMapping
    public Box addNewBox(@RequestBody Box box){
        return boxMng.add(box);
    }

    @PatchMapping
    public Box addNewPatch(@RequestBody Box box){
        return boxMng.add(box);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id){
        boxMng.delete(id);
    }
}
