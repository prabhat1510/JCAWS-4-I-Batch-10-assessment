package com.springAssessment.controllers;

import java.util.HashMap;
import java.util.Map;

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

import com.springAssessment.exception.CollegeNotFoundException;
import com.springAssessment.models.College;
import com.springAssessment.services.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {

	@Autowired
	CollegeService collegeService;

	@GetMapping()
	public ResponseEntity<Map<String, Object>> fetchAllColleges() {

		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("data", collegeService.getAllColleges());

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Map<String, Object>> fetchCollegeById(@PathVariable(value = "id") Integer collegeId)
			throws CollegeNotFoundException {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("data", collegeService.getCollegeById(collegeId));

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.OK);
	}

	@GetMapping("/address/{address}")
	public ResponseEntity<Map<String, Object>> fetchCollegeByAddress(@PathVariable(value = "address") String address)
			throws CollegeNotFoundException {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("data", collegeService.getCollegeByAddress(address));

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.OK);
	}

	@GetMapping("/name/{name}")
	public ResponseEntity<Map<String, Object>> fetchCollegeByName(@PathVariable(value = "name") String name)
			throws CollegeNotFoundException {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("data", collegeService.getCollegeByName(name));

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<Map<String, Object>> addCollege(@RequestBody College college) {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("message", "data inserted successfully!");
		res.put("data", collegeService.addCollege(college));

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.CREATED);
	}

	@PutMapping()
	public ResponseEntity<Map<String, Object>> updateCollege(@RequestBody College college) {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("message", "data updated successfully!");
		res.put("data", collegeService.updateCollegeDetails(college, college.getCollegeId()));

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Object>> deleteCollege(@PathVariable(value = "id") Integer collegeId) {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", collegeService.deleteCollegeById(collegeId));
		res.put("message", "data deleted successfully!");

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.OK);
	}

}
