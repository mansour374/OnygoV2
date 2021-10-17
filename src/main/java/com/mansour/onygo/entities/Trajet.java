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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Trajet implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String depart, destination;
	private int  nombrePassager;
	private double prixParSiege;
	@Temporal(TemporalType.TIME)
	private Date heureDepart, heureArrive;
	@OneToMany(mappedBy = "trajet")
	private Collection<ReservationTrajet> reservaTrajets;
	@ManyToOne
	private Partenaire partenaire;
	@ManyToOne
	private Voiture voiture;
}
