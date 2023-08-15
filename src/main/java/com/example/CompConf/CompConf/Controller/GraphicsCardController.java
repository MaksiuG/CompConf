package com.example.CompConf.CompConf.Controller;

import com.example.CompConf.CompConf.Menage.GraphicsCardMng;
import com.example.CompConf.CompConf.Model.Computer;
import com.example.CompConf.CompConf.Model.GraphicsCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/graphicscard")
public class GraphicsCardController {
    private GraphicsCardMng graphicsCardMng;
    private Logger logger = LoggerFactory.getLogger(LoggerFactory.class);

    public GraphicsCardController(GraphicsCardMng graphicsCardMng) {
        this.graphicsCardMng = graphicsCardMng;
    }

    @GetMapping("/get-all-graphics")
    public Iterable<GraphicsCard> getAllGraphics(){logger.warn("Getting all the graphics");return graphicsCardMng.findAll();
    }
    @GetMapping("/get-graphics-by-id")
    public Optional<GraphicsCard> getGraphicsByid(@RequestParam Long id){
        return graphicsCardMng.findByComputerId(id);
    }

    @PostMapping
    public GraphicsCard addNewGraphics(@RequestBody GraphicsCard graphicsCard){
        return graphicsCardMng.add(graphicsCard);
    }

    @PatchMapping
    public GraphicsCard addNewPatch(@RequestBody GraphicsCard graphicsCard){
        return graphicsCardMng.add(graphicsCard);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id){
        graphicsCardMng.delete(id);
    }
}
