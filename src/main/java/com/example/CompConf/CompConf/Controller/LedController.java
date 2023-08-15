package com.example.CompConf.CompConf.Controller;

import com.example.CompConf.CompConf.Menage.LedMng;
import com.example.CompConf.CompConf.Model.GraphicsCard;
import com.example.CompConf.CompConf.Model.Led;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/leds")
public class LedController {

    private LedMng ledMng;
    private Logger logger = LoggerFactory.getLogger(LoggerFactory.class);

    @Autowired
    public LedController(LedMng ledMng) {
        this.ledMng = ledMng;
    }

    @GetMapping("/get-all-leds")
    public Iterable<Led> getAllLeds(){logger.warn("Getting all the Leds");return ledMng.findAll();
    }
    @GetMapping("/get-graphics-by-id")
    public Optional<Led> getLedsByid(@RequestParam Long id){
        return ledMng.findByLedrId(id);
    }

    @PostMapping
    public Led addNewLeds(@RequestBody Led led){
        return ledMng.add(led);
    }

    @PatchMapping
    public Led addNewPatch(@RequestBody Led led){
        return ledMng.add(led);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id){
        ledMng.delete(id);
    }
}
