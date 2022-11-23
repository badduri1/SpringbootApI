package com.demo.starwarsapi.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * Service to manage request over SWAP API
 * 
 * @author Srinivas
 *
 */
@Service
public class SwapiService {

	// Static Members:
	private final static Logger LOGGER = LoggerFactory.getLogger(SwapiService.class);
	private final static String FMT_URL = "https://swapi.dev/api/planets/{id}";

	@Autowired
	private RestTemplate restTemplate;

	public String findPlanetByName(String id) {
		ResponseEntity<String> response = null;
		try {

			HttpHeaders headers = new HttpHeaders();

			HttpEntity requestEntity = new HttpEntity<>(headers);

			response = restTemplate.exchange(FMT_URL, HttpMethod.GET, requestEntity, String.class, id);

		} catch (RestClientException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return response.getBody();
	}

}
