package com.mansour.onygo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mansour.onygo.entities.Trajet;

@RepositoryRestResource
public interface TrajetRepo extends JpaRepository<Trajet, Long> {

}
