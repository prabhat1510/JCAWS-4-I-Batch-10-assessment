package com.collegemanagementrestapp.consumer;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.collegemanagementrestapp.model.Student;

@RestController
public class ConsumeController {

	@Autowired 
	RestTemplate restTemplate;
	
	//get Api

	@GetMapping("all-college")
	public ResponseEntity<List<ConsumeCollege>> getAllCollegess(){
		ConsumeCollege[] objects = restTemplate.getForObject("http://localhost:8080/college", ConsumeCollege[].class);
		return new ResponseEntity<>(Arrays.asList(objects),HttpStatus.OK);
	}
	
	
}
