package in.ac.jmi.controllers;

import in.ac.jmi.constants.PaperCategory;
import in.ac.jmi.constants.Semester;
import in.ac.jmi.entities.Subject;
import in.ac.jmi.entities.User;
import in.ac.jmi.repositories.SubjectRepository;
import in.ac.jmi.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
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

	/*
	 * Displaying Admin Home page with all the information from users and Subjects
	 * 
	 * */
	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public String getAdminHome(Model model) {
		model.addAttribute("users", userRepository.findAll());
		model.addAttribute("subjects",subjectRepository.findAll());
		return "admin/AdminHome";
	}

	
	@RequestMapping(value = "/user", params = "add", method = RequestMethod.GET)
	public String getAddUser() {
		return "user/add";
	}

	@RequestMapping(value = "/user", params = "add", method = RequestMethod.POST)
	public String postAddUser(@RequestParam("name") String name,
			@RequestParam("role") String role) {
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
		return "user/edit";
	}

	@RequestMapping(value = "/user", params = "edit", method = RequestMethod.POST)
	@Transactional
	public String postEditUser(@RequestParam long id,@RequestParam String name,
			@RequestParam String role) {

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
	 * 
	 * */
	
	@RequestMapping(value = "/subject", params = "add", method = RequestMethod.GET)
	public String getAddSubject(Model model) {
//		ArrayList<PaperCategory> categories=new Paper

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
		
		Subject subject=new Subject(paperNumber,paperName,paperCategory,paperSemester);

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
		Subject subject=subjectRepository.findOne(id);
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

}
