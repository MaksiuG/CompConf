package com.example.CompConf.CompConf.Controller;

import com.example.CompConf.CompConf.Menage.ProcessorMng;
import com.example.CompConf.CompConf.Model.Processor;
import com.example.CompConf.CompConf.Model.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/processors")
public class ProcessorController {
    private ProcessorMng processorMng;
    private Logger logger = LoggerFactory.getLogger(LoggerFactory.class);
    @Autowired
    public ProcessorController(ProcessorMng processorMng) {
        this.processorMng = processorMng;
    }

    @GetMapping("/get-all-processors")
    public Iterable<Processor> getAllProcessors(){
        return processorMng.findAll();
    }
    @GetMapping("/get-processor-by-id")
    public Optional<Processor> getProcessorByid(@RequestParam Long id){
        return processorMng.findByComputerId(id);
    }

    @PostMapping
    public Processor addNewProcesssor(@RequestBody Processor processor){
        return processorMng.add(processor);
    }

    @PatchMapping
    public Processor addNewPatch(@RequestBody Processor processor){
        return processorMng.add(processor);
    }

    @DeleteMapping
    public void deleteById(Long id){
        processorMng.delete(id);
    }
}
