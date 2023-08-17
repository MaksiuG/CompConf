package com.example.CompConf.CompConf.Menage;

import com.example.CompConf.CompConf.Model.Led;
import com.example.CompConf.CompConf.Model.Repos.StorageRepository;
import com.example.CompConf.CompConf.Model.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class StorageMng {
    private StorageRepository storageRepository;

    @Autowired
    public StorageMng(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

    public Iterable<Storage> findAll(){
        return storageRepository.findAll();
    }
    public Optional<Storage> findByStorageId(@RequestParam Long id){
        return storageRepository.findById(id);
    }

    public Storage add(Storage storage){
        return storageRepository.saveAndFlush(storage);
    }

    public Storage addPatch(Storage storage){
        return storageRepository.save(storage);
    }

    public void delete(Long id){
        storageRepository.deleteById(id);
    }
}
