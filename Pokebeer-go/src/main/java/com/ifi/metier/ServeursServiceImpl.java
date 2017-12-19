package com.ifi.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifi.dao.BiersRepository;
import com.ifi.entities.Biers;
import com.ifi.entities.Clients;

@Service
@Transactional
public class ServeursServiceImpl implements IServeurService {

	@Autowired
	private BiersRepository biersRepository;
	@Override
	public Biers addBiers(Biers bi) {
		
		Biers bier= biersRepository.save(bi);
		return bier;
	}

	@Override
	public Biers modifierBiers(Biers bi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clients afficherClients(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Clients> afficherAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Biers> afficherBiersPrefClient(int idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Biers> afficherAllBiers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Biers afficherBiers(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Clients> afficherAllClientsPrefBier(int idBiers) {
		// TODO Auto-generated method stub
		return null;
	}

}
