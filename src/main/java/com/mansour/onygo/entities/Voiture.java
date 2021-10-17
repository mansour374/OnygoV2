package com.mansour.onygo.entities;

import java.io.Serializable;
import java.sql.Blob;
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
public class Voiture implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marque, model, 
	matriculation, paysImmatriculation, 
	carburant, emplacementActuel;
	private Boolean disponibilite;
	private Date anneeImmatraiculation;
	private int kilometrage;
	@OneToMany(mappedBy = "voiture")
	private Collection<Trajet> trajets;
	@OneToMany(mappedBy = "voiture")
	private Collection<Location> locations;
	@ManyToOne
	private Partenaire partenaire;
}
