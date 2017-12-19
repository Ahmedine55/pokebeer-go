package com.ifi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifi.entities.Personne;

public interface PersonneRepository
extends JpaRepository<Personne, Integer>{

}
