package com.example.CompConf.CompConf.Model.Repos;

import com.example.CompConf.CompConf.Model.Computer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompRepository extends JpaRepository<Computer, Long> {
    Page<Computer> findAll(Pageable pageable);
}
