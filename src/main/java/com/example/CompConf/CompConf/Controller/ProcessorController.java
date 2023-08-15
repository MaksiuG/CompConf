package com.example.CompConf.CompConf.Controller;

import com.example.CompConf.CompConf.Menage.ProcessorMng;
import com.example.CompConf.CompConf.Model.Processor;
import com.example.CompConf.CompConf.Model.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProcessorController {
    private ProcessorMng processorMng;

    @Autowired
    public ProcessorController(ProcessorMng processorMng) {
        this.processorMng = processorMng;
    }

    @GetMapping("/get-all-processors")
    public Iterable<Processor> getAllComps(){
        return processorMng.findAll();
    }
    @GetMapping("/get-processor-by-id")
    public Optional<Processor> getCompByid(@RequestParam Long id){
        return processorMng.findByComputerId(id);
    }

    @PostMapping
    public Processor addNewComp(Processor processor){
        return processorMng.add(processor);
    }

    @PatchMapping
    public Processor addNewPatch(Processor processor){
        return processorMng.add(processor);
    }

    @DeleteMapping
    public void deleteById(Long id){
        processorMng.delete(id);
    }
}
