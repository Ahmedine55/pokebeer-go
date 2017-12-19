package com.ifi.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Biers implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private String type;
	private String origine;
	
	@OneToMany()
	private Collection<Biers> listeBiersRecomands;

	@ManyToMany
	private Collection<Clients> listeClientsPref;
	
	@OneToMany(mappedBy="biers")
	private Collection<NoterBiers> listeNotes;
	
	@ManyToMany
	private Collection<Bars> listeBars;
	
	public Biers(String nom, String type, String origine) {
		super();
		this.nom = nom;
		this.type = type;
		this.origine = origine;
	}
	
	public Biers() {
		
	}

	public Collection<Biers> getListeBiersRecomands() {
		return listeBiersRecomands;
	}

	public void setListeBiersRecomands(Collection<Biers> listeBiersRecomands) {
		this.listeBiersRecomands = listeBiersRecomands;
	}

	public Collection<Clients> getListeClientsPref() {
		return listeClientsPref;
	}

	public void setListeClientsPref(Collection<Clients> listeClientsPref) {
		this.listeClientsPref = listeClientsPref;
	}

	public Collection<NoterBiers> getListeNotes() {
		return listeNotes;
	}

	public void setListeNotes(Collection<NoterBiers> listeNotes) {
		this.listeNotes = listeNotes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public Collection<Bars> getListeBars() {
		return listeBars;
	}

	public void setListeBars(Collection<Bars> listeBars) {
		this.listeBars = listeBars;
	}

}
