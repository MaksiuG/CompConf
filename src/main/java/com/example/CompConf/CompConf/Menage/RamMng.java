package com.example.CompConf.CompConf.Menage;

import com.example.CompConf.CompConf.Model.Led;
import com.example.CompConf.CompConf.Model.RamMemory;
import com.example.CompConf.CompConf.Model.Repos.ProcessorRepository;
import com.example.CompConf.CompConf.Model.Repos.RamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class RamMng {

   private RamRepository ramRepository;

   @Autowired
    public RamMng(RamRepository ramRepository) {
        this.ramRepository = ramRepository;
    }

    public Iterable<RamMemory> findAll(){
        return ramRepository.findAll();
    }
    public Optional<RamMemory> findByRamId(@RequestParam Long id){
        return ramRepository.findById(id);
    }

    public RamMemory add(RamMemory ramMemory){
        return ramRepository.saveAndFlush(ramMemory);
    }

    public RamMemory addPatch(RamMemory ramMemory){
        return ramRepository.save(ramMemory);
    }

    public void delete(Long id){
        ramRepository.deleteById(id);
    }
}
