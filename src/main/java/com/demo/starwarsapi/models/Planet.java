package com.demo.starwarsapi.models;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Entity model to represent a planet
 * 
 * @author Srinivas
 *
 */
public class Planet implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String climate;
	private String terrain;
	private Date created = new Date();
	private Set<String> films = new LinkedHashSet<>();

	// Constructors:
	public Planet() {

	}

	public Planet(String name, String climate, String terrain) {
		this.name = name;
		this.climate = climate;
		this.terrain = terrain;
	}

	// Getters and Setters:

	public String getName() {
		return name;
	}

	public Planet setName(String name) {
		this.name = name;
		return this;
	}

	public String getClimate() {
		return climate;
	}

	public Planet setClimate(String climate) {
		this.climate = climate;
		return this;
	}

	public String getTerrain() {
		return terrain;
	}

	public Planet setTerrain(String terrain) {
		this.terrain = terrain;
		return this;
	}

	public Date getCreated() {
		return created;
	}

	public Set<String> getFilms() {
		return films;
	}

	public Planet setFilms(Set<String> films) {
		this.films = films;
		return this;
	}

	// End Getters and Setters:

	@Override
	public String toString() {
		return "Planet [name=" + name + ", climate=" + climate + ", terrain=" + terrain + ", created=" + created
				+ ", films=" + films + "]";
	}

}
