package com.example.CompConf.CompConf.Model.Repos;

import com.example.CompConf.CompConf.Model.Box;
import com.example.CompConf.CompConf.Model.Led;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LedRepository extends JpaRepository<Led,Long> {
}
