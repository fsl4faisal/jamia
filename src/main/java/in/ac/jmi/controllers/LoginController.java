package in.ac.jmi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getLogin() {
		System.out.println("Inside getLogin above login");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLogin(@RequestParam("user_name") String userName,
			@RequestParam("password") String password) {

		System.out.println(userName + " " + password);
		System.out.println("Inside postLogin above StudentsDetails");

		if (userName.equals("faisal") && password.equals("faisal"))
			return "admin/AdminHome";
		else
			return "login";
	}

	@RequestMapping(value = "/studentDetails", method = RequestMethod.GET)
	public String getStudentDetails() {
		System.out.println("Inside getStudentDetails above StudentsDetails");
		return "StudentDetails";
	}

	@RequestMapping(value = "/studentDetails", method = RequestMethod.POST)
	public String postStudentDetails() {
		System.out.println("Inside postStudent above ExamForm");
		return "ExamForm";
	}

}
