package com.mansour.onygo;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mansour.onygo.dao.LocationRepository;
import com.mansour.onygo.dao.ReservationTrajetRepo;
import com.mansour.onygo.dao.TrajetRepo;
import com.mansour.onygo.dao.UtilisateurRepo;
import com.mansour.onygo.dao.VoitureRepo;
import com.mansour.onygo.entities.Client;
import com.mansour.onygo.entities.Location;
import com.mansour.onygo.entities.Partenaire;
import com.mansour.onygo.entities.ReservationTrajet;
import com.mansour.onygo.entities.Trajet;
import com.mansour.onygo.entities.Voiture;

import net.bytebuddy.utility.RandomString;

@SpringBootApplication
public class OnygoApplication implements CommandLineRunner {
	@Autowired
	private VoitureRepo voitureRepo;
	@Autowired
	private TrajetRepo trajetRepo;
	@Autowired
	private UtilisateurRepo utilisateurRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OnygoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new  Client();
		c1.setAdresse("dakar");
		c1.setEmail(null);
		c1.setIsActive(true);
		c1.setPrenom("Abdoulaye");
		c1.setNom("wade");
		c1.setTelephone(null);
		utilisateurRepo.save(c1);
		
		Client c2 = new  Client();
		c2.setAdresse("dakar");
		c2.setEmail(null);
		c2.setIsActive(true);
		c2.setPrenom("GORA");
		c2.setNom("MBAYE");
		c2.setTelephone(null);
		utilisateurRepo.save(c2);
		
		Client c3 = new  Client();
		c3.setAdresse("dakar");
		c3.setEmail(null);
		c3.setIsActive(true);
		c3.setPrenom("ALIOUNE");
		c3.setNom("DIONE");
		c3.setTelephone(null);
		utilisateurRepo.save(c3);
		
		Client c4 = new  Client();
		c4.setAdresse("dakar");
		c4.setEmail(null);
		c4.setIsActive(true);
		c4.setPrenom("Babacar");
		c4.setNom("Senghor");
		c4.setTelephone(null);
		utilisateurRepo.save(c4);
		
		Partenaire p1 = new Partenaire();
		p1.setNom("yade");
		p1.setPrenom("mansour");
		p1.setAdresse(RandomString.make(18));
		p1.setEmail("yadeserignemansour@gmail.com");
		p1.setPassword(null);
		p1.setTelephone(null);
		p1.setIsActive(true);
		p1.setComment(RandomString.make(25));
		p1.setComplementAdresse(RandomString.make(20));
		p1.setNumPermis(null);
		p1.setDateNaissance(new Date());
		p1.setDateObtension(new Date());
		p1.setLocations(null);
		p1.setVoitures(null);
		p1.setTrajets(null);
		utilisateurRepo.save(p1);
		
		Partenaire p2 = new Partenaire();
		p2.setNom("senghor");
		p2.setPrenom("Babacar");
		p2.setAdresse(RandomString.make(18));
		p2.setEmail("senghor@gmail.com");
		p2.setPassword(null);
		p2.setTelephone(null);
		p2.setIsActive(true);
		p2.setComment(RandomString.make(25));
		p2.setComplementAdresse(RandomString.make(20));
		p2.setNumPermis(null);
		p2.setDateNaissance(new Date());
		p2.setDateObtension(new Date());
		p2.setLocations(null);
		p2.setVoitures(null);
		p2.setTrajets(null);
		utilisateurRepo.save(p2);
		
		Voiture v1 = new Voiture();
		v1.setMarque("BMW");
		v1.setModel("X3");
		v1.setMatriculation(null);
		v1.setPaysImmatriculation("senegal");
		v1.setCarburant("essence");
		v1.setEmplacementActuel("Dakar");
		v1.setDisponibilite(true);
		v1.setKilometrage(90000);
		v1.setAnneeImmatraiculation(new Date());
		v1.setLocations(null);
		v1.setTrajets(null);
		v1.setPartenaire(p1);
		voitureRepo.save(v1);
		
		Voiture v2 = new Voiture();
		v2.setMarque("FORD");
		v2.setModel("ESCAPE");
		v2.setMatriculation(null);
		v2.setPaysImmatriculation("senegal");
		v2.setCarburant("essence");
		v2.setEmplacementActuel("Dakar");
		v2.setDisponibilite(true);
		v2.setKilometrage(90000);
		v2.setAnneeImmatraiculation(new Date());
		v2.setLocations(null);
		v2.setTrajets(null);
		v2.setPartenaire(p2);
		voitureRepo.save(v2);
		
		Voiture v3 = new Voiture();
		v3.setMarque("HUNDAI");
		v3.setModel("ELANTRA");
		v3.setMatriculation(null);
		v3.setPaysImmatriculation("senegal");
		v3.setCarburant("essence");
		v3.setEmplacementActuel("Dakar");
		v3.setDisponibilite(false);
		v3.setKilometrage(90000);
		v3.setAnneeImmatraiculation(new Date());
		v3.setLocations(null);
		v3.setTrajets(null);
		v3.setPartenaire(p1);
		voitureRepo.save(v3);
		
		Voiture v4 = new Voiture();
		v4.setMarque("RENAULD");
		v4.setModel("4X4");
		v4.setMatriculation(null);
		v4.setPaysImmatriculation("senegal");
		v4.setCarburant("essence");
		v4.setEmplacementActuel("Dakar");
		v4.setDisponibilite(false);
		v4.setKilometrage(90000);
		v4.setAnneeImmatraiculation(new Date());
		v4.setLocations(null);
		v4.setTrajets(null);
		v4.setPartenaire(p2);
		voitureRepo.save(v4);
		
		Voiture v5 = new Voiture();
		v5.setMarque("BMW");
		v5.setModel("X5");
		v5.setMatriculation(null);
		v5.setPaysImmatriculation("senegal");
		v5.setCarburant("essence");
		v5.setEmplacementActuel("Dakar");
		v5.setDisponibilite(true);
		v5.setKilometrage(90000);
		v5.setAnneeImmatraiculation(new Date());
		v5.setLocations(null);
		v5.setTrajets(null);
		v5.setPartenaire(p1);
		voitureRepo.save(v5);
		
		Trajet t1 = new Trajet();
		t1.setDepart("DAKAR");
		t1.setDestination("THIES");
		t1.setHeureDepart(new Date());
		t1.setHeureArrive(new Date());
		t1.setNombrePassager(4);
		t1.setPrixParSiege(4000);
		t1.setVoiture(v1);
		t1.setPartenaire(p1);
		trajetRepo.save(t1);
		
		Trajet t2 = new Trajet();
		t2.setDepart("DAKAR");
		t2.setDestination("TOUBA");
		t2.setHeureDepart(new Date());
		t2.setHeureArrive(new Date());
		t2.setNombrePassager(4);
		t2.setPrixParSiege(4000);
		t2.setVoiture(v3);
		t2.setPartenaire(p1);
		trajetRepo.save(t2);
		
		Trajet t3 = new Trajet();
		t3.setDepart("DAKAR");
		t3.setDestination("LOUGA");
		t3.setHeureDepart(new Date());
		t3.setHeureArrive(new Date());
		t3.setNombrePassager(4);
		t3.setPrixParSiege(4000);
		t3.setVoiture(v5);
		t3.setPartenaire(p1);
		trajetRepo.save(t3);
		
		Trajet t4 = new Trajet();
		t4.setDepart("DAKAR");
		t4.setDestination("MBOUR");
		t4.setHeureDepart(new Date());
		t4.setHeureArrive(new Date());
		t4.setNombrePassager(4);
		t4.setPrixParSiege(4000);
		t4.setVoiture(v5);
		t4.setPartenaire(p1);
		trajetRepo.save(t4);
		
		Trajet t5 = new Trajet();
		t5.setDepart("DAKAR");
		t5.setDestination("MBOUR");
		t5.setHeureDepart(new Date());
		t5.setHeureArrive(new Date());
		t5.setNombrePassager(4);
		t5.setPrixParSiege(4000);
		t5.setVoiture(v5);
		t5.setPartenaire(p1);
		trajetRepo.save(t5);
				
	/*	Location l1 = new Location();
		l1.setAdresse(null);ss
		l1.setComment(null);
		l1.setDateDebut(new Date());
		l1.setDateFin(new Date());
		l1.setLieuxRendezvous("dakar");
		l1.setPrix(3000.0);
		LocationRepository.*/
		
	}

}