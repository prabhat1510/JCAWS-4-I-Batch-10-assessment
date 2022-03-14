package com.assignment.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.entity.College;
import com.assignment.exception.CollegeNotFoundException;
import com.assignment.service.CollegeService;

@RestController
public class CollegeController {
	@Autowired
	CollegeService collegeService;
/*
	// Retrieve
	@GetMapping("/retrievecolleges")
	public ModelAndView getAllColleges() {
		List<College> listOfCollege = collegeService.getAllColleges();
		Map collegeModel = new HashMap();
	
		if (!listOfCollege.isEmpty()) {
			collegeModel.put("listOfCollege", listOfCollege);
			return new ModelAndView("allcollege", employeeModel, HttpStatus.OK);
		} else {
			employeeModel.put("message", "No employees found");
			return new ModelAndView("nodatafound", employeeModel, HttpStatus.NOT_FOUND);
		}

	}

	// GetEmployeeForm
	@GetMapping("/employee")
	public ModelAndView getEmployeeForm(@ModelAttribute Employee employee) {
		ModelAndView modelAndView = new ModelAndView("employeeform");
		return modelAndView;
	}

	// Create
	@PostMapping("/saveemployee")
	public ModelAndView addEmployee(Employee employee) {
		Employee emp = employeeService.addEmployee(employee);
		ModelAndView modelAndView;
		// Model in Spring Web MVC is a map
		Map messageModel = new HashMap();
		if (emp != null) {
			messageModel.put("emplData", emp);
			modelAndView = new ModelAndView("successWithData", messageModel);
		} else {
			messageModel.put("errormsg", "Unable to add employee");
			modelAndView = new ModelAndView("errorMsg", messageModel);
		}
		return modelAndView;
	}

	// Retrieve
	@GetMapping("/employeeById/{empId}")
	public ModelAndView getEmployeeById(@PathVariable Integer empId) {
		Employee employee = employeeService.getEmployeeById(empId);
		Map employeeModel = new HashMap();
		if (employee != null) {
			employeeModel.put("employee", employee);
			return new ModelAndView("employeedetails", employeeModel);
		} else {
			employeeModel.put("message", "No employees found");
			return new ModelAndView("nodatafound", employeeModel);
		}
	}

	// Delete
	@GetMapping("/deleteemployeeById")
	public ModelAndView deleteEmployeeById(@RequestParam(value = "id") Integer empId) {
		Map model = new HashMap();
		if (employeeService.deleteEmployeeById(empId)) {
			model.put("deletemsg", "Employee deleted susccessfully");
			return new ModelAndView("successdelete", model);
		} else {
			model.put("message", "No employees found");
			return new ModelAndView("nodatafound", model);
		}

	}

	// GetEmployeeForm
	@GetMapping("/employeedeleteform")
	public ModelAndView getEmployeeDeleteForm(@ModelAttribute Employee employee) {
		ModelAndView modelAndView = new ModelAndView("employeeformdelete");
		return modelAndView;
	}

	// DeleteMapping annotation
	@DeleteMapping("/deleteemployee")
	public ModelAndView deleteEmployee(@ModelAttribute Employee employee) {
		Map model = new HashMap();
		if (employeeService.deleteEmployee(employee)) {
			model.put("deletemsg", "Employee deleted susccessfully");
			return new ModelAndView("successdelete", model);
		} else {
			model.put("message", "No employees found");
			return new ModelAndView("nodatafound", model);
		}
	}
	
	  //Update ---
	  //RequestMapping(value="/updateemployee",method=RequestMethod.POST) 
	  //@PutMapping("/updateemployee")
	  @PostMapping("/updateemployee")
	  public ModelAndView updateEmployee(Employee employee){ 
		  Integer res = -1;
			Map model = new HashMap<>();
			res = employeeService.updateEmployee(employee);
			if(res!=-1) {
				model.put("message", "Employee Updation Success");
				return new ModelAndView("message",model);
			}else {
				model.put("message", "Employee Updation Failure");
				return new ModelAndView("message",model);
			}

	  }
	 
	
	@GetMapping("/employeeByName")
	public ModelAndView getEmployeeByName(@RequestParam(value="eName") String empName) {
		Employee employee = employeeService.getEmployeeByName(empName);
		Map employeeModel = new HashMap();
		if (employee != null) {
			employeeModel.put("employee", employee);
			return new ModelAndView("employeedetails", employeeModel);
		} else {
			employeeModel.put("message", "No employees found");
			return new ModelAndView("nodatafound", employeeModel);
		}
	}

}
*/
	
	@GetMapping("/colleges")
	List<College> all() {
		return collegeService.all();
	}
	
  //public College addCollege(College college);
	@PostMapping("/colleges")
	College newCollege(@RequestBody College newCollege) {
		
		return collegeService.newCollege(newCollege);
	}
  
//http://localhost:8080/api/v1/college/15
	@GetMapping("/college/{collegeId}")
	College one(@PathVariable Integer collegeId) throws CollegeNotFoundException {
		return collegeService.one(collegeId);

	}

	 @PutMapping("/colleges/{id}")
	 College replaceCollege(@RequestBody College newCollege, @PathVariable Integer id) {
		  return collegeService.replaceCollege(newCollege,id);
	  }
  
	 @DeleteMapping("/colleges/{id}")
	  void deleteCollege(@PathVariable Integer id) {
	    //repository.deleteById(id);
		 collegeService.deleteCollege(id);
	  }
}
//Custom query retrieve - data by name by role 
