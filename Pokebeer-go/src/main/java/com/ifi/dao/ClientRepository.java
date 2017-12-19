package com.ifi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifi.entities.Clients;

public interface ClientRepository
extends JpaRepository<Clients, Integer> {

}
