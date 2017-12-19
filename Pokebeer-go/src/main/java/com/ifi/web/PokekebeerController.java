package com.ifi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ifi.metier.IServeurService;

@Controller
public class PokekebeerController {

	@Autowired
	private IServeurService serveurService;
	
	@RequestMapping("/serveur")
	    public String index() {
		return"Serveur";
	}
	
}
