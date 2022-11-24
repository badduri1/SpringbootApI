package com.demo.starwarsapi.controllers;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.starwarsapi.services.SwapiService;

/**
 * @author Srinivas
 */
@RestController
@RequestMapping("/planets")
public class PlanetsController {

	@Autowired
	private SwapiService swapiService;

	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getPlanet(@PathVariable @Max(256) Integer id) {

		ResponseEntity<String> planet = swapiService.findPlanetById(id);

		if (planet != null) {
			return ResponseEntity.ok(planet.getBody());
		}

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The Planet with id " + id + " was not found");
	}

}
