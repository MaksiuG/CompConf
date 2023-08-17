package com.example.CompConf.CompConf.Model.Repos;

import com.example.CompConf.CompConf.Model.Box;
import com.example.CompConf.CompConf.Model.Motherboard;
import com.example.CompConf.CompConf.Model.PowerSupply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerSupplyRepository extends JpaRepository<PowerSupply,Long> {
}
