package com.mansour.onygo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mansour.onygo.entities.ReservationTrajet;


@RepositoryRestResource
public interface ReservationTrajetRepo extends JpaRepository<ReservationTrajet, Long> {

}
