package com.example.CompConf.CompConf.Controller;

import com.example.CompConf.CompConf.Menage.CompMng;
import com.example.CompConf.CompConf.Menage.ProcessorMng;
import com.example.CompConf.CompConf.Model.Computer;
import com.example.CompConf.CompConf.Model.DTO.ComputerDTO;
import com.example.CompConf.CompConf.Model.Repos.CompRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comps")
public class CompController {

    private CompMng compMng;
    private ModelMapper modelMapper;
    private Logger logger = LoggerFactory.getLogger(LoggerFactory.class);


    @Autowired
    public CompController(CompMng compMng, ModelMapper modelMapper) {
        this.compMng = compMng;
        this.modelMapper = modelMapper;
    }

    public CompController() {
    }

    @GetMapping("/get-all-computers")
    public Iterable<Computer> getAllComps(){logger.warn("Getting all the computers");return compMng.findAll();
    }
    @GetMapping("/get-all-computersDTO")
    public List<ComputerDTO> getAllCompsDTO(){logger.warn("Getting all the computers");
        List<Computer> list = compMng.findAllLists();
        return list.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/get-all-computersPage")
    public Page<Computer> getAllCompsPage(int pageNumber, int pageSize){
        return compMng.getAllCompsPage(pageNumber,pageSize);
    }
    @GetMapping("/get-computer-by-id")
    public Optional<Computer> getCompByid(@RequestParam Long id){
        return compMng.findByComputerId(id);
    }

    @PostMapping
    public ResponseEntity<Computer> addNewComp(@RequestBody Computer computer){
        compMng.add(computer);
        return ResponseEntity.accepted().build();
    }
    @PatchMapping
    public Computer addNewPatch(@RequestBody Computer computer){
        return compMng.add(computer);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id){
        compMng.delete(id);
    }
    // working :)
    private ComputerDTO convertToDTO(Computer computer){
        ComputerDTO computerDTO = modelMapper.map(computer, ComputerDTO.class);
        return computerDTO;
    }
    //introduce this later
    private Computer convertToEntity(ComputerDTO computer){
       Computer computer1 = modelMapper.map(computer, Computer.class);
        return computer1;
    }


}
