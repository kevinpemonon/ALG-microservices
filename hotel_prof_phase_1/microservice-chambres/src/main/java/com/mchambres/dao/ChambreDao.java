package com.mchambres.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mchambres.model.Chambre;


@Repository
public interface ChambreDao extends JpaRepository<Chambre, Integer>{
}
