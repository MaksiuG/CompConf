package com.example.CompConf.CompConf.Model.Repos;

import com.example.CompConf.CompConf.Model.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxRepository extends JpaRepository<Box,Long> {
}
