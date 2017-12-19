package com.ifi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class NoterBiers {
 
	@Id
	@GeneratedValue
	private int id;
	private int note;
	@ManyToOne
	private Clients clients;
	
	@ManyToOne
	private Biers biers;
	
	public NoterBiers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NoterBiers(int note, Clients clients, Biers biers) {
		super();
		this.note = note;
		this.clients = clients;
		this.biers = biers;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public Clients getClients() {
		return clients;
	}
	public void setClients(Clients clients) {
		this.clients = clients;
	}
	public Biers getBiers() {
		return biers;
	}
	public void setBiers(Biers biers) {
		this.biers = biers;
	}
}
