package com.springassesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springassesment.entites.Collage;
import com.springassesment.service.CollageService;

@RestController
@RequestMapping("/collage")
public class CollageController {

	@Autowired
	CollageService collageService;
	
	@GetMapping("/collages")
	public ResponseEntity<List<Collage>> retriveAllCollage(){
		return new ResponseEntity<>(collageService.getAllCollage(),HttpStatus.FOUND);
	}
	
	@PostMapping("/newCollage")
	public ResponseEntity<Collage> createCollageDetail(@RequestBody Collage Collage) {
		return  new ResponseEntity<>(collageService.createCollage(Collage),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Collage> retrieveCollageById(@PathVariable(value="id") Integer CollageId){
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/collage/{collageId}")
	  void deleteEmployee(@PathVariable Integer CollageId) {
		collageService.deleteCollageById(CollageId);
	}
	
	@PutMapping("/collage/{collageId}")
	  Collage updateCollage(@RequestBody Collage newCollage, @PathVariable Integer CollageId) {
		  return collageService.updateCollage(newCollage,CollageId);
	 }

}
