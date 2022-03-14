package com.springassessmentdeve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springassessmentdeve.entity.Collage;
import com.springassessmentdeve.exception.CollageNotFoundException;
import com.springassessmentdeve.service.CollageService;

@RestController
@RequestMapping("/collage")
public class CollageController {
	@Autowired
	CollageService collageService;
	
	@GetMapping("/collageById/{id}")
	public ResponseEntity<Collage> getCollageById(@PathVariable(value = "id") Integer collageId) throws CollageNotFoundException{
		return new ResponseEntity<>(collageService.getCollageById(collageId),HttpStatus.OK);
	}
	
	@PostMapping("/addCollage")
	public ResponseEntity<Collage> addCollage(@RequestBody Collage collage){
		return new ResponseEntity<>(collageService.addcollage(collage),HttpStatus.CREATED);
	}
}
