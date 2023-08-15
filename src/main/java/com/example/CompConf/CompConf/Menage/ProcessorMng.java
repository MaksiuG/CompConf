package com.example.CompConf.CompConf.Menage;

import com.example.CompConf.CompConf.Model.Computer;
import com.example.CompConf.CompConf.Model.Processor;
import com.example.CompConf.CompConf.Model.Repos.ProcessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class ProcessorMng {
    private ProcessorRepository processorRepository;

@Autowired
    public ProcessorMng(ProcessorRepository processorRepository) { this.processorRepository = processorRepository;}

    public ProcessorMng() {}

    public Iterable<Processor> findAll(){
        return processorRepository.findAll();
    }
    public Optional<Processor> findByComputerId(@RequestParam Long id){ return processorRepository.findById(id);}

    public Processor add(Processor processor){ return processorRepository.save(processor);}

    public Processor addPatch(Processor processor){
        return processorRepository.save(processor);
    }

    public void delete(Long id){ processorRepository.deleteById(id); }
}
