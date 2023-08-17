package com.example.CompConf.CompConf.Controller;

import com.example.CompConf.CompConf.Menage.StorageMng;
import com.example.CompConf.CompConf.Model.Led;
import com.example.CompConf.CompConf.Model.Storage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/storages")
public class StorageController {
    private Logger logger = LoggerFactory.getLogger(LoggerFactory.class);
    private StorageMng storageMng;

    @Autowired
    public StorageController(StorageMng storageMng) {
        this.storageMng = storageMng;
    }


    @GetMapping("/get-all-storage")
    public Iterable<Storage> getAllStorage(){logger.warn("Getting all the Storages");return storageMng.findAll();
    }
    @GetMapping("/get-storage-by-id")
    public Optional<Storage> getStorageByid(@RequestParam Long id){
        return storageMng.findByStorageId(id);
    }

    @PostMapping
    public Storage addNewStorage(@RequestBody Storage storage){
        return storageMng.add(storage);
    }

    @PatchMapping
    public Storage addNewPatch(@RequestBody Storage storage){
        return storageMng.add(storage);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id){
        storageMng.delete(id);
    }
}
