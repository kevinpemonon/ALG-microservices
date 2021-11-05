package com.mgestionchambres.activemqclient.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgestionchambres.activemqclient.model.Chambre;



@Repository
public interface ChambreDao extends JpaRepository<Chambre, Integer>{
}
