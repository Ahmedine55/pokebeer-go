package com.ifi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ifi.dao.BarsRepository;
import com.ifi.dao.BiersRepository;
import com.ifi.dao.ClientRepository;
import com.ifi.dao.NoterBiersRepository;
import com.ifi.dao.PersonneRepository;
import com.ifi.dao.ServeursRepository;
import com.ifi.entities.Bars;
import com.ifi.entities.Biers;
import com.ifi.entities.Clients;
import com.ifi.entities.NoterBiers;
import com.ifi.entities.Personne;
import com.ifi.entities.Serveurs;

@SpringBootApplication
public class PokebeerGoApplication implements CommandLineRunner {

	@Autowired
	private PersonneRepository personneRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ServeursRepository ServeursRepository;
	@Autowired
	private BarsRepository barsRepository;
	@Autowired
	private BiersRepository biersRepository;
	@Autowired
	private NoterBiersRepository noterBiersRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PokebeerGoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		Personne c1 = personneRepository.save(new Clients("Sally","Etudiante",21));
		Personne c2 = personneRepository.save(new Clients("Eric","Développeur",29));
		Bars ba1=barsRepository.save(new Bars("Pokébar","50.609616","3.136315","Avenue paul langevin, 59650 Villeneuve d'ascq, France"));
		Bars ba2=barsRepository.save(new Bars("Le Bavarois","50.618850","3.130473","Avenue paul langevin, 59650 Villeneuve d'ascq, France"));
		Bars ba3=barsRepository.save(new Bars("Le Dandy","50.638881","3.060561","67 Rue Basse 59800 Lille"));
		Bars ba4=barsRepository.save(new Bars("Bar Brasserie l'Imaginaire","50.640551","3.064263","67 Rue Basse, 59800 Lille"));

		
		Personne s1 = personneRepository.save(new Serveurs("Fred","Serveur",33,ba1));
		Biers bi1= biersRepository.save(new Biers("La Chouffe","fruitées","Belgique"));
		Biers bi2= biersRepository.save(new Biers("Agrumbocq","fruitées","Belgique"));
		Biers bi3= biersRepository.save(new Biers("Angelus","fruitées","France"));
		Biers bi4= biersRepository.save(new Biers("Verte du Mont Blanc","fruitées","France"));
		Biers bi5= biersRepository.save(new Biers("Levrette Cherry","fruitées","France"));
		Biers bi6= biersRepository.save(new Biers("Jupiler","fruitées","Belgique"));
		Biers bi7= biersRepository.save(new Biers("Carlsberg","pression","Danemark"));
		Biers bi8= biersRepository.save(new Biers("Bud","pression","États-Unis"));
		Biers bi9= biersRepository.save(new Biers("Desperados","pression","Alsace"));
		Biers bi10= biersRepository.save(new Biers("Leffe","pression","Belgique"));
		Biers bi11= biersRepository.save(new Biers("Kilkenny","pression","Irlande"));

		noterBiersRepository.save(new NoterBiers(4,(Clients) c1,bi1));
		noterBiersRepository.save(new NoterBiers(5,(Clients) c1,bi11));
		noterBiersRepository.save(new NoterBiers(2,(Clients) c1,bi7));
		noterBiersRepository.save(new NoterBiers(4,(Clients) c2,bi4));
		noterBiersRepository.save(new NoterBiers(3,(Clients) c2,bi6));
		noterBiersRepository.save(new NoterBiers(5,(Clients) c2,bi1));
		





	}
}
