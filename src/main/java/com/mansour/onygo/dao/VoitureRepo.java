package com.mansour.onygo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mansour.onygo.entities.Voiture;

@RepositoryRestResource
public interface VoitureRepo extends JpaRepository<Voiture, Long> {
	@RestResource (path = "/disponibiliteVoiture")
	public List<Voiture> findByDisponibiliteIsTrue();
	
	/*@RestResource ( path = "/voitureByMatricule")
	public List<Voiture> findByNameContains(@Param("marque") String marque);*/
}
