package com.ifi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifi.entities.Biers;

public interface BiersRepository 
extends JpaRepository<Biers, Integer> {

}
