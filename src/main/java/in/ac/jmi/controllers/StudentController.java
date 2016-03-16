package in.ac.jmi.controllers;

import in.ac.jmi.constants.CourseType;
import in.ac.jmi.constants.ExaminationName;
import in.ac.jmi.constants.Flag;
import in.ac.jmi.constants.Gender;
import in.ac.jmi.constants.MediumOfExamination;
import in.ac.jmi.constants.Role;
import in.ac.jmi.constants.Semester;
import in.ac.jmi.entities.Student;
import in.ac.jmi.repositories.StudentRepository;

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
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;

	/*
	 * 
	 * Student CRUD
	 */
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}

	@RequestMapping(value = "/student", params = "add", method = RequestMethod.GET)
	public String getAddStudent(Model model) {
		model.addAttribute("examination_names", ExaminationName.values());
		model.addAttribute("flags", Flag.values());
		model.addAttribute("genders", Gender.values());
		model.addAttribute("medium_of_examinations",
				MediumOfExamination.values());
		model.addAttribute("semesters", Semester.values());
		model.addAttribute("course_types", CourseType.values());

		ArrayList<Role> roles = new ArrayList<Role>();
		roles.add(Role.STUDENT);
		model.addAttribute("roles", roles);

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
		model.addAttribute("examination_names", ExaminationName.values());
		model.addAttribute("flags", Flag.values());
		model.addAttribute("genders", Gender.values());
		model.addAttribute("medium_of_examinations",
				MediumOfExamination.values());
		model.addAttribute("semesters", Semester.values());
		model.addAttribute("course_types", CourseType.values());
		return "student/view";
	}

	@RequestMapping(value = "/student", params = "edit", method = RequestMethod.GET)
	public String getEditStudent(@RequestParam("id") long id, Model model) {

		model.addAttribute("student", studentRepository.findOne(id));
		model.addAttribute("examination_names", ExaminationName.values());
		model.addAttribute("flags", Flag.values());
		model.addAttribute("genders", Gender.values());
		model.addAttribute("medium_of_examinations",
				MediumOfExamination.values());
		model.addAttribute("semesters", Semester.values());
		model.addAttribute("course_types", CourseType.values());

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

		updatedStudent.setCourseType(student.getCourseType());
		updatedStudent.setExaminationName(student.getExaminationName());
		updatedStudent.setYear(student.getYear());
		updatedStudent.setSemesterName(student.getSemesterName());
		updatedStudent.setUser(student.getUser());
		updatedStudent.setDateOfBirth(student.getDateOfBirth());
		updatedStudent.setPlaceOfBirth(student.getPlaceOfBirth());
		updatedStudent.setNationality(student.getNationality());
		updatedStudent.setReligion(student.getReligion());
		updatedStudent.setGender(student.getGender());
		updatedStudent.setFatherName(student.getFatherName());
		updatedStudent.setMotherName(student.getMotherName());
		updatedStudent.setSpouseName(student.getSpouseName());
		updatedStudent.setMobileNumber(student.getMobileNumber());
		updatedStudent.setCorrespondenceAddress(student
				.getCorrespondenceAddress());
		updatedStudent.setPermanentAddress(student.getPermanentAddress());
		updatedStudent.setMediumOfExamination(student.getMediumOfExamination());
		updatedStudent.setEnrollmentNumber(student.getEnrollmentNumber());
		updatedStudent.setStudentId(student.getStudentId());
		updatedStudent.setQuotaFlag(student.getQuotaFlag());

		updatedStudent = studentRepository.save(updatedStudent);
		return "redirect:student?id=" + updatedStudent.getId();
	}

	@RequestMapping(value = "/student", params = "delete", method = RequestMethod.POST)
	public String postDeleteStudent(@RequestParam long id) {
		studentRepository.delete(studentRepository.findOne(id));
		return "redirect:adminHome";
	}

	/*
	 * 
	 * Student Rustigated CRUD
	 */

	@RequestMapping(value = "/rustigatedDetails", params = "edit", method = RequestMethod.GET)
	public String getEditRustigatedDetails(@RequestParam("id") long id,
			Model model) {

		model.addAttribute("student", studentRepository.findOne(id));
		model.addAttribute("flags", Flag.values());

		return "student/editRustigatedDetails";
	}

	@RequestMapping(value = "/rustigatedDetails", params = "edit", method = RequestMethod.POST)
	@Transactional
	public String postEditRustigatedDetails(@ModelAttribute Student student) {
		Student updatedStudent = studentRepository.findOne(student.getId());

		updatedStudent.setDisqualifiedFlag(student.getDisqualifiedFlag());
		updatedStudent.setDisqualifiedDescription(student
				.getDisqualifiedDescription());
		System.out.println("Inside postEditRustigatedDetails");
		System.out.println(student);
		System.out.println("Updated Student");
		System.out.println(updatedStudent);
		student = studentRepository.save(updatedStudent);
		return "redirect:rustigatedDetails?id=" + updatedStudent.getId();
	}

	@RequestMapping(value = "/rustigatedDetails", method = RequestMethod.GET)
	public String postEditRustigatedDetails(@RequestParam("id") long id,
			Model model) {
		model.addAttribute("student", studentRepository.findOne(id));
		return "student/view_all";
	}


}
