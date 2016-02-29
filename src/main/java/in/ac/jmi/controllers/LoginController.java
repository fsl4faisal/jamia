package in.ac.jmi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin() {
	
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLogin() {
		
		return "StudentDetails";
	}
	
	@RequestMapping(value = "/studentDetails", method = RequestMethod.GET)
	public String getStudentDetails() {
		
		return "StudentDetails";
	}
	
	@RequestMapping(value = "/studentDetails", method = RequestMethod.POST)
	public String postStudentDetails() {
		
		return "ExamForm";
	}
}
