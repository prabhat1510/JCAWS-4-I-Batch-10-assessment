package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.College;

import exception.CollegeNotFoundException;

import service.CollegeService;


@RestController
@RequestMapping("/college")
public class CollegeController {
	@Autowired
	CollegeService collegeService;
	
	@GetMapping("/colleges")
	public ResponseEntity<List<College>> retrieveAllCollege(){
		return new ResponseEntity<>(collegeService.retrieveAllCollege(),HttpStatus.FOUND);
	}
	@PostMapping("/newCollege")
	public ResponseEntity<College> createCollegeDetail(@RequestBody College college) {
		return  new ResponseEntity<>(collegeService.createCollegeDetail(college),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<College> retrieveCollegeById(@PathVariable(value="collegeId") Integer collegeId) throws CollegeNotFoundException{
		return new ResponseEntity<>(collegeService.retrieveCollegeById(collegeId),HttpStatus.OK);
	}
}
