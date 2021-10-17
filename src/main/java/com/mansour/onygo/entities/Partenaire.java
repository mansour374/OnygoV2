package com.mansour.onygo.entities;

import java.util.Collection;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@DiscriminatorValue("PART")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Partenaire extends Utilusateur {
	private String comment, complementAdresse, numPermis; 
	private Date dateNaissance;
	private Date dateObtension;
	@OneToMany(mappedBy = "partenaire", fetch = FetchType.LAZY)
	private Collection<Voiture> voitures;
	@OneToMany(mappedBy = "partenaire")
	private Collection<Location> locations;
	@OneToMany(mappedBy = "partenaire")
	private Collection<Trajet> trajets;
	
}
