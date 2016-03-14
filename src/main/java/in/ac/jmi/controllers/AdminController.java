package in.ac.jmi.controllers;

import in.ac.jmi.constants.DepartmentName;
import in.ac.jmi.constants.ExaminationName;
import in.ac.jmi.constants.Flag;
import in.ac.jmi.constants.Gender;
import in.ac.jmi.constants.MediumOfExamination;
import in.ac.jmi.constants.PaperCategory;
import in.ac.jmi.constants.Role;
import in.ac.jmi.constants.Semester;
import in.ac.jmi.entities.Student;
import in.ac.jmi.entities.Subject;
import in.ac.jmi.entities.User;
import in.ac.jmi.repositories.StudentRepository;
import in.ac.jmi.repositories.SubjectRepository;
import in.ac.jmi.repositories.UserRepository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

	@InitBinder
	public void initBinder(WebDataBinder binder) {		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public String getAdminHome(Model model) {
		model.addAttribute("users", userRepository.findAll());
		model.addAttribute("subjects", subjectRepository.findAll());
		model.addAttribute("students", studentRepository.findAll());
		return "admin/AdminHome";
	}

	@RequestMapping(value = "/user", params = "add", method = RequestMethod.GET)
	public String getAddUser(Model model) {
		ArrayList<Role> roles = new ArrayList<Role>();

		// From user Add only admin and head of department can be added
		roles.add(Role.ADMIN);
		roles.add(Role.HEAD_OF_DEPARTMENT);
		model.addAttribute("roles", roles);
		return "user/add";
	}

	@RequestMapping(value = "/user", params = "add", method = RequestMethod.POST)
	public String postAddUser(@ModelAttribute User user) {
		System.out.println("Inside postAddUser");
		user = userRepository.save(user);
		return "redirect:user?id=" + user.getId();
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String postAddUser(@RequestParam("id") long id, Model model) {
		model.addAttribute("user", userRepository.findOne(id));
		return "user/view";
	}

	@RequestMapping(value = "/user", params = "edit", method = RequestMethod.GET)
	public String getEditUser(@RequestParam("id") long id, Model model) {
		model.addAttribute("user", userRepository.findOne(id));

		ArrayList<Role> roles = new ArrayList<Role>();
		roles.add(Role.ADMIN);
		roles.add(Role.HEAD_OF_DEPARTMENT);
		model.addAttribute("roles", roles);
		return "user/edit";
	}

	@RequestMapping(value = "/user", params = "edit", method = RequestMethod.POST)
	@Transactional
	public String postEditUser(@ModelAttribute User user) {

		User newUser = userRepository.findOne(user.getId());

		newUser.setEmailAddress(user.getEmailAddress());
		newUser.setName(user.getName());
		newUser.setRole(user.getRole());

		newUser = userRepository.save(newUser);
		// redirect to view page
		return "redirect:user?id=" + newUser.getId();
	}

	@RequestMapping(value = "/user", params = "delete", method = RequestMethod.POST)
	public String postDeleteUser(@RequestParam long id) {
		userRepository.delete(userRepository.findOne(id));
		return "redirect:adminHome";
	}

	/*
	 * Adding/viewing/editing and deleting subjects
	 */

	@RequestMapping(value = "/subject", params = "add", method = RequestMethod.GET)
	public String getAddSubject(Model model) {
		// ArrayList<PaperCategory> categories=new Paper

		model.addAttribute("categories", PaperCategory.values());
		model.addAttribute("semesters", Semester.values());
		model.addAttribute("departments", DepartmentName.values());

		return "subject/add";
	}

	@RequestMapping(value = "/subject", params = "add", method = RequestMethod.POST)
	public String postAddSubject(@ModelAttribute Subject subject) {
		System.out.println("Inside postAddSubject");

		subject = subjectRepository.save(subject);
		return "redirect:subject?id=" + subject.getId();

	}

	@RequestMapping(value = "/subject", method = RequestMethod.GET)
	public String postAddSubject(@RequestParam("id") long id, Model model) {
		model.addAttribute("subject", subjectRepository.findOne(id));
		return "subject/view";
	}

	@RequestMapping(value = "/subject", params = "edit", method = RequestMethod.GET)
	public String getEditSubject(@RequestParam("id") long id, Model model) {
		model.addAttribute("subject", subjectRepository.findOne(id));
		model.addAttribute("categories", PaperCategory.values());
		model.addAttribute("semesters", Semester.values());
		model.addAttribute("departments", DepartmentName.values());
		return "subject/edit";
	}

	@RequestMapping(value = "/subject", params = "edit", method = RequestMethod.POST)
	@Transactional
	public String postEditSubject(@ModelAttribute Subject subject) {

		Subject updatedSubject = subjectRepository.findOne(subject.getId());
		
		updatedSubject.setDepartmentName(subject.getDepartmentName());
		updatedSubject.setPaperCategory(subject.getPaperCategory());
		updatedSubject.setPaperName(subject.getPaperName());
		updatedSubject.setPaperSemester(subject.getPaperSemester());
		updatedSubject.setPaperNumber(subject.getPaperNumber());

		updatedSubject = subjectRepository.save(updatedSubject);
		// redirect to view page
		return "redirect:subject?id=" + updatedSubject.getId();
	}

	@RequestMapping(value = "/subject", params = "delete", method = RequestMethod.POST)
	public String postDeleteSubject(@RequestParam long id) {
		subjectRepository.delete(subjectRepository.findOne(id));
		return "redirect:adminHome";
	}

	/*
	 * 
	 * Student CRUD
	 */

	@RequestMapping(value = "/student", params = "add", method = RequestMethod.GET)
	public String getAddStudent(Model model) {
		model.addAttribute("examination_names", ExaminationName.values());
		model.addAttribute("flags", Flag.values());
		model.addAttribute("genders", Gender.values());
		model.addAttribute("medium_of_examinations",
				MediumOfExamination.values());
		model.addAttribute("semesters", Semester.values());

		return "student/add";
	}

	@RequestMapping(value = "/student", params = "add", method = RequestMethod.POST)
	public String postAddStudent(@ModelAttribute Student student) {
		System.out.println("Inside postAddStudent");

		System.out.println(student);

		student = studentRepository.save(student);
		return "redirect:student?id=" + student.getId();
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String postAddStudent(@RequestParam("id") long id, Model model) {
		model.addAttribute("student", studentRepository.findOne(id));
		return "student/view";
	}

	// TODO from here
	@RequestMapping(value = "/student", params = "edit", method = RequestMethod.GET)
	public String getEditStudent(@RequestParam("id") long id, Model model) {
		model.addAttribute("student", studentRepository.findOne(id));

		ArrayList<Role> roles = new ArrayList<Role>();

		// sending the role of student only since it can not be changed to
		// anything else
		roles.add(Role.STUDENT);
		model.addAttribute("roles", roles);
		return "student/edit";
	}

	@RequestMapping(value = "/student", params = "edit", method = RequestMethod.POST)
	@Transactional
	public String postEditStudent(@ModelAttribute Student student) {

		Student updatedStudent = studentRepository.findOne(student.getId());
		student = studentRepository.save(updatedStudent);
		
		return "redirect:student?id=" + updatedStudent.getId();
	}

	@RequestMapping(value = "/student", params = "delete", method = RequestMethod.POST)
	public String postDeleteStudent(@RequestParam long id) {
		studentRepository.delete(studentRepository.findOne(id));
		return "redirect:adminHome";
	}

}
