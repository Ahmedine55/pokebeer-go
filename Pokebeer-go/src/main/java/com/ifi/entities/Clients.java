package com.ifi.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("client")
public class Clients extends Personne {

	@ManyToMany(mappedBy="listeClientsPref")
	private Collection<Biers> listeBiersPref;
	@OneToMany(mappedBy="clients")
	private Collection<NoterBiers> listeNotes;

	public Clients() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clients(String nom, String titre, int age) {
		super(nom, titre, age);
		// TODO Auto-generated constructor stub
	}

	public Collection<Biers> getListeBiersPref() {
		return listeBiersPref;
	}

	public void setListeBiersPref(Collection<Biers> listeBiersPref) {
		this.listeBiersPref = listeBiersPref;
	}

	public Collection<NoterBiers> getListeNotes() {
		return listeNotes;
	}

	public void setListeNotes(Collection<NoterBiers> listeNotes) {
		this.listeNotes = listeNotes;
	}

}
