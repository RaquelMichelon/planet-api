package com.example.planetapi.service;

import org.springframework.data.repository.CrudRepository;

import com.example.planetapi.domain.Planet;

public interface PlanetRepository extends CrudRepository<Planet, Long> {

}
