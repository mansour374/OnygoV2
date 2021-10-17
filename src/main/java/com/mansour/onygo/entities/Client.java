package com.mansour.onygo.entities;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@DiscriminatorValue("CLT")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Client extends Utilusateur {
	@OneToMany(mappedBy = "client")
	private Collection<ReservationLoc> reservationLocs;
	@OneToMany(mappedBy = "client")
	private Collection<ReservationTrajet> reservationTrajets;
	
}
