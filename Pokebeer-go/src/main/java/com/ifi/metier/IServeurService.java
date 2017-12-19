package com.ifi.metier;

import java.util.List;

import com.ifi.entities.Biers;
import com.ifi.entities.Clients;

public interface IServeurService {

	public Biers addBiers(Biers bi);
	public Biers modifierBiers(Biers bi);
	public Clients afficherClients(int id);
	public List<Clients> afficherAllClients();
	public List<Biers> afficherBiersPrefClient(int idClient);
	public List<Biers> afficherAllBiers();
	public Biers afficherBiers(int id);
	public List<Clients> afficherAllClientsPrefBier(int idBiers);
	

}
