package com.ifi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifi.entities.Bars;

public interface BarsRepository 
extends JpaRepository<Bars, Integer> {

}

