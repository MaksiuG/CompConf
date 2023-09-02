package com.example.CompConf.CompConf.Menage;

import com.example.CompConf.CompConf.Model.Computer;
import com.example.CompConf.CompConf.Model.DTO.ComputerDTO;
import com.example.CompConf.CompConf.Model.Repos.CompRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
@Service
public class CompMng {
    private CompRepository compRepository;


   @Autowired
    public CompMng(CompRepository compRepository) {
        this.compRepository = compRepository;

    }

    public CompMng() {
    }

    public Iterable<Computer> findAll(){
       return compRepository.findAll();
    }
    public List<Computer> findAllLists(){
        return compRepository.findAll();
    }

    public Optional<Computer> findByComputerId(@RequestParam Long id){
       return compRepository.findById(id);
    }

    public Computer add(Computer computer){
       return compRepository.saveAndFlush(computer);
    }

    public Computer addPatch(Computer computer){
        return compRepository.save(computer);
    }

    public void delete(Long id){
       compRepository.deleteById(id);
    }

    public Page<Computer> getAllCompsPage(int pageNumber, int pageSize){
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return compRepository.findAll(pageable);
    }

}
