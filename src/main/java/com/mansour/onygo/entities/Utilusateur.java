package com.mansour.onygo.entities;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE" , length= 	5)
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public abstract class Utilusateur implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom, prenom, adresse, email, password, telephone;
	private Boolean isActive;
	
}
