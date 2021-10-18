package com.mansour.onygo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Location implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String adresse, comment, lieuxRendezvous;
	private Date dateDebut, dateFin;
	private Double prix;
	@ManyToOne
	private Partenaire partenaire;
	@ManyToOne
	private  Voiture voiture;
	@OneToMany(mappedBy = "location")
	private Collection<ReservationLoc> reservationLocs;
	
}
