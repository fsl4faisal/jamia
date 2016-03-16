package in.ac.jmi.controllers;

import in.ac.jmi.constants.Role;
import in.ac.jmi.repositories.StudentRepository;
import in.ac.jmi.repositories.SubjectRepository;
import in.ac.jmi.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private SubjectRepository subjectRepository;

	@Autowired
	private StudentRepository studentRepository;

	/*
	 * Displaying Admin Home page with all the information from users and
	 * Subjects
	 */

	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public String getAdminHome(Model model) {

		model.addAttribute("users", userRepository.adminUsers(Role.STUDENT));
		model.addAttribute("subjects", subjectRepository.findAll());
		model.addAttribute("students", studentRepository.findAll());
		return "admin/AdminHome";
	}


	
	
}
