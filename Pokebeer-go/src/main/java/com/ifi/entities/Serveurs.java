package com.ifi.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("serveur")
public class Serveurs extends Personne{
	
	@ManyToOne
	private Bars bar;
	public Serveurs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Serveurs(String nom, String titre, int age, Bars bar) {
		super(nom, titre, age);
		this.bar = bar;
	}
	public Bars getBar() {
		return bar;
	}
	public void setBar(Bars bar) {
		this.bar = bar;
	}
	

}