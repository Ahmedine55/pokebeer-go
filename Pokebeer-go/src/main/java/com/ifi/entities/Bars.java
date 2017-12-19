package com.ifi.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Bars implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private String latitude;
	private String longitude;
	private String adresse;
	@OneToMany(mappedBy="bar")
    private Collection<Serveurs> seveurs;
	@ManyToMany(mappedBy="listeBars")
	private Collection<Biers> listeBiers;
	
	public Bars() {
		
	}
	
	public Bars(String nom, String latitude, String longitude, String adresse) {
		super();
		this.nom = nom;
		this.latitude = latitude;
		this.longitude = longitude;
		this.adresse = adresse;
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
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Collection<Biers> getListeBiers() {
		return listeBiers;
	}
	public void setListeBiers(Collection<Biers> listeBiers) {
		this.listeBiers = listeBiers;
	}
	
}
