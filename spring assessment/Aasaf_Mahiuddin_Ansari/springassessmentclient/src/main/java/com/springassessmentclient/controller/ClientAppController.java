package com.springassessmentclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springassessmentclient.model.Collage;

@RestController
public class ClientAppController {
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/allDetails/{id}")
	public ResponseEntity<List<Collage>> getallDetails(Integer collageId){
		Collage[] collage = restTemplate.getForObject("http://localhost:8081/collage/collageById/{id}", Collage[].class);
		
		return new ResponseEntity<>(Arrarys.asList(collage),HttpStatus.OK);
		
	}
}
