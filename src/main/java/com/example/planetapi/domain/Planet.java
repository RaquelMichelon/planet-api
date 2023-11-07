package com.example.planetapi.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "planets")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String terrain;
    private String climate;

    public Planet(String name, String terrain, String climate) {
        this.name = name;
        this.terrain = terrain;
        this.climate = climate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    // using the apache commons lib
    @Override
    public boolean equals(Object object) {
        return EqualsBuilder.reflectionEquals(object, this);
    }

}
