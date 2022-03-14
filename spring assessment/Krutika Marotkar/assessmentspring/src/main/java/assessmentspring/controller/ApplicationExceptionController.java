package assessmentspring.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import assessmentspring.exception.StudentNotFoundException;
@RestController
public class ApplicationExceptionController {

	@ExceptionHandler(StudentNotFoundException.class)
	public String employeeNotFoundHandler(StudentNotFoundException ex) {
		return ex.getMessage();
	}
}
