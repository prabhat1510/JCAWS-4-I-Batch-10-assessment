package assessmentspring.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import assessmentspring.entity.College;
import assessmentspring.exception.CollegeNotFoundException;
import assessmentspring.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {

	 private static final int ResponseEntity = 0;
	@Autowired
	 CollegeService collegeService;
	 //create
	 @PostMapping("/newstudent")
		public ResponseEntity<College> addCollege(@RequestBody College newcollege) {
			return new ResponseEntity<>(collegeService.addCollege(newcollege), HttpStatus.CREATED);
		}
	 
	 //Retrieve 
	 
	 @GetMapping("/college")
		public ResponseEntity<List<College>> getAllCollege() {
			return new ResponseEntity<>(collegeService.getAllCollege(), HttpStatus.FOUND);
		}

		

		@GetMapping("/{id}")
		public ResponseEntity<College> getByCollegeId(@PathVariable(value = "id") Integer collegeId)
				throws CollegeNotFoundException {
			return new ResponseEntity<>(collegeService.getByCollegeId(collegeId), HttpStatus.FOUND);
		}
	/*
		@GetMapping("/collegeByName")
		public ResponseEntity<College> getByCollegeName(@RequestParam(value = "collegeName") String collegeName) {
			return ResponseEntity<College>(collegeService.getByCollegeName(collegeName), HttpStatus.FOUND);
	}

	
      
      @GetMapping("/findbycollegeaddress")  
	  public ResponseEntity<College> getByCollegeAddress(@RequestParam(value = "address") String address)
		{
		  return ResponseEntity<College>(collegeService.getByCollegeAddress(address), HttpStatus.FOUND);	
		}*/
      
	@DeleteMapping("/deletebyId/{collegeId}")
	 Boolean deleteCollegeById( @PathVariable Integer collegeId)
	 {
		 return collegeService.deleteCollegeById(collegeId);
	 }
	
	@PutMapping("/update/{collegeId}")
	College updateCollege(@RequestBody College college,@PathVariable Integer collegeId)
	{
		return collegeService.updateCollege(college, collegeId);
	}
}
