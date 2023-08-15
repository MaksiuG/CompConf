package com.example.CompConf.CompConf.Model.Repos;

import com.example.CompConf.CompConf.Model.Processor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessorRepository extends JpaRepository<Processor, Long> {
}
