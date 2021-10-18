package com.mansour.onygo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@DiscriminatorValue("admi")
@Data @ToString @AllArgsConstructor
public class Admin extends Utilusateur {
	
	
}
