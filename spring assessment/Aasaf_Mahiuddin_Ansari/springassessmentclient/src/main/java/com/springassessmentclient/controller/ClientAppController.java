package com.springassessmentclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientAppController {
	@Autowired
	RestTemplate restTemplate;
	
//	@GetMapping("/allDetails/{id}")
//	public ResponseEntity<T>
}
