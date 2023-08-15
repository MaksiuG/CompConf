package com.example.CompConf.CompConf.Menage;


import com.example.CompConf.CompConf.Model.GraphicsCard;
import com.example.CompConf.CompConf.Model.Repos.GraphicsCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class GraphicsCardMng {
    private GraphicsCardRepository graphicsCardRepository;


    @Autowired
    public GraphicsCardMng(GraphicsCardRepository graphicsCardRepository) {
        this.graphicsCardRepository = graphicsCardRepository;
    }

    public Iterable<GraphicsCard> findAll(){
        return graphicsCardRepository.findAll();
    }
    public Optional<GraphicsCard> findByComputerId(@RequestParam Long id){
        return graphicsCardRepository.findById(id);
    }

    public GraphicsCard add(GraphicsCard graphicsCard){
        return graphicsCardRepository.saveAndFlush(graphicsCard);
    }

    public GraphicsCard addPatch(GraphicsCard graphicsCard){
        return graphicsCardRepository.save(graphicsCard);
    }

    public void delete(Long id){
        graphicsCardRepository.deleteById(id);
    }

}
