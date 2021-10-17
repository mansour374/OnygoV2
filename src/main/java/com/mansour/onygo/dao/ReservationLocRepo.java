package com.mansour.onygo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mansour.onygo.entities.ReservationLoc;

@RepositoryRestResource
public interface ReservationLocRepo extends JpaRepository<ReservationLoc, Long> {

}
