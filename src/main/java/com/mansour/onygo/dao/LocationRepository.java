package com.mansour.onygo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mansour.onygo.entities.Location;
@RepositoryRestResource
public interface LocationRepository extends JpaRepository<Location, Long>{

}
