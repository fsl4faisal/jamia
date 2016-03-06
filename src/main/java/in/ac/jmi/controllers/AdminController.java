package in.ac.jmi.controllers;

import in.ac.jmi.constants.ExaminationName;
import in.ac.jmi.constants.Flag;
import in.ac.jmi.constants.Gender;
import in.ac.jmi.constants.MediumOfExamination;
import in.ac.jmi.constants.PaperCategory;
import in.ac.jmi.constants.Role;
import in.ac.jmi.constants.Semester;
import in.ac.jmi.entities.Address;
import in.ac.jmi.entities.PlaceOfBirth;
import in.ac.jmi.entities.Student;
import in.ac.jmi.entities.Subject;
import in.ac.jmi.entities.User;
import in.ac.jmi.repositories.StudentRepository;
import in.ac.jmi.repositories.SubjectRepository;
import in.ac.jmi.repositories.UserRepository;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
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

	@Autowired
	private static final Logger logger = 
			LoggerFactory.getLogger(AdminController.class);
	/*
	 * Displaying Admin Home page with all the information from users and
	 * Subjects
	 */

	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public String getAdminHome(Model model) {
		model.addAttribute("users", userRepository.findAll());
		model.addAttribute("subjects", subjectRepository.findAll());
		model.addAttribute("students", studentRepository.findAll());
		return "admin/AdminHome";
	}

	@RequestMapping(value = "/user", params = "add", method = RequestMethod.GET)
	public String getAddUser(Model model) {
		model.addAttribute("roles", Role.values());
		return "user/add";
	}

	@RequestMapping(value = "/user", params = "add", method = RequestMethod.POST)
	public String postAddUser(@RequestParam("name") String name,
			@RequestParam("role") Role role) {
		System.out.println("Inside postAddUser");
		User user = new User(name, role);
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
		model.addAttribute("roles", Role.values());
		return "user/edit";
	}

	@RequestMapping(value = "/user", params = "edit", method = RequestMethod.POST)
	@Transactional
	public String postEditUser(@RequestParam long id,
			@RequestParam String name, @RequestParam("role") Role role) {

		User user = userRepository.findOne(id);
		user.setName(name);
		user.setRole(role);

		user = userRepository.save(user);
		// redirect to view page
		return "redirect:user?id=" + user.getId();
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
		return "subject/add";
	}

	@RequestMapping(value = "/subject", params = "add", method = RequestMethod.POST)
	public String postAddSubject(@RequestParam("paper_name") String paperName,
			@RequestParam("paper_number") String paperNumber,
			@RequestParam("paper_category") PaperCategory paperCategory,
			@RequestParam("paper_semester") Semester paperSemester) {
		System.out.println("Inside postAddSubject");

		Subject subject = new Subject(paperNumber, paperName, paperCategory,
				paperSemester);

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
		Subject subject = subjectRepository.findOne(id);
		System.out.println(subject.getPaperCategory().name());
		System.out.println(subject.getPaperSemester().name());

		System.out.println(subject.getPaperCategory().getValue());
		System.out.println(subject.getPaperSemester().getValue());

		System.out.println(subject.getPaperCategory().getName());
		System.out.println(subject.getPaperSemester().getName());

		return "subject/edit";
	}

	@RequestMapping(value = "/subject", params = "edit", method = RequestMethod.POST)
	@Transactional
	public String postEditSubject(@RequestParam("id") long id,
			@RequestParam("paper_name") String paperName,
			@RequestParam("paper_number") String paperNumber,
			@RequestParam("paper_category") PaperCategory paperCategory,
			@RequestParam("paper_semester") Semester paperSemester) {

		Subject subject = subjectRepository.findOne(id);
		subject.setPaperCategory(paperCategory);
		subject.setPaperName(paperName);
		subject.setPaperNumber(paperNumber);
		subject.setPaperSemester(paperSemester);

		subject = subjectRepository.save(subject);
		// redirect to view page
		return "redirect:subject?id=" + subject.getId();
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
		model.addAttribute("medium_of_examinations", MediumOfExamination.values());
		model.addAttribute("semesters", Semester.values());

		return "student/add";
	}

	@RequestMapping(value = "/student", params = "add", method = RequestMethod.POST)
	public String postAddStudent(
			@RequestParam("examination_name") ExaminationName examinationName,
			@RequestParam("semester_name") Semester semesterName,
			@RequestParam("year") short year,
			@RequestParam("student_name") String studentName,
			@RequestParam("date_of_birth") @DateTimeFormat(pattern="yyyy-MM-dd") Date dateOfBirth,//TODO
			@RequestParam("email_address") String emailAddress,
			@RequestParam("nationality") String nationality,
			@RequestParam("religion") String religion,
			@RequestParam("gender") Gender gender,
			
			@RequestParam("father_name") String fatherName,
			@RequestParam("mother_name") String motherName,
			@RequestParam("spouse_name") String spouseName,
			
			@RequestParam("mobile_number") String mobileNumber,
			@RequestParam("medium_of_examination") MediumOfExamination mediumOfExamination,
			@RequestParam("enrollment_number") String enrollmentNumber,
			@RequestParam("belong_to_SC_ST_OBC") Flag quotaFlag,
			@RequestParam("rusticted_expelled_disqualified_debarred_flag") Flag disqualifiedFlag,

			@RequestParam("DOB_town") String dobTown,
			@RequestParam("DOB_distt") String dobDistt,
			@RequestParam("DOB_state") String dobState,

			@RequestParam("permanent_street") String permanentStreet,
			@RequestParam("permanent_city") String permanentCity,
			@RequestParam("permanent_state") String permanentState,
			@RequestParam("permanent_pincode") int permanentPincode,

			@RequestParam("correspondence_street") String correspondenceStreet,
			@RequestParam("correspondence_city") String correspondenceCity,
			@RequestParam("correspondence_state") String correspondenceState,
			@RequestParam("correspondence_pincode") int correspondencePincode

	) {
		System.out.println("Inside postAddStudent");
		logger.debug("Inside postAddStudent from logger");
		PlaceOfBirth placeOfBirth = new PlaceOfBirth(dobTown, dobDistt,
				dobState);

		Address correspondenceAddress = new Address(correspondenceStreet,
				correspondenceCity, correspondenceState, correspondencePincode);

		Address permanentAddress = new Address(permanentStreet, permanentCity,
				permanentState, permanentPincode);

		Student student = new Student(
				examinationName, 
				semesterName, 
				year,
				studentName, 
				dateOfBirth, 
				emailAddress,
				placeOfBirth, 
				nationality, 
				religion,
				gender, 
				fatherName,
				motherName, 
				spouseName,
				correspondenceAddress, 
				permanentAddress, 
				mobileNumber,
				mediumOfExamination, 
				enrollmentNumber, 
				quotaFlag,
				disqualifiedFlag, 
				null, null, Flag.NO);

		student = studentRepository.save(student);
		return "redirect:student?id=" + student.getId();
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String postAddStudent(@RequestParam("id") long id, Model model) {
		model.addAttribute("student", studentRepository.findOne(id));
		return "student/view";
	}

	
	
//TODO from here
	@RequestMapping(value = "/student", params = "edit", method = RequestMethod.GET)
	public String getEditStudent(@RequestParam("id") long id, Model model) {
		model.addAttribute("student", studentRepository.findOne(id));
		model.addAttribute("roles", Role.values());
		return "student/edit";
	}

	@RequestMapping(value = "/student", params = "edit", method = RequestMethod.POST)
	@Transactional
	public String postEditStudent(@RequestParam long id,
			@RequestParam String name, @RequestParam("role") Role role) {

		Student student = studentRepository.findOne(id);
//		student.setName(name);
//		student.setRole(role);

		student = studentRepository.save(student);
		// redirect to view page
		return "redirect:student?id=" + student.getId();
	}

	@RequestMapping(value = "/student", params = "delete", method = RequestMethod.POST)
	public String postDeleteStudent(@RequestParam long id) {
		studentRepository.delete(studentRepository.findOne(id));
		return "redirect:adminHome";
	}

}
