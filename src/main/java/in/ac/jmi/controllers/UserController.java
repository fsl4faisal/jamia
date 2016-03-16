package in.ac.jmi.controllers;

import in.ac.jmi.constants.Role;
import in.ac.jmi.entities.User;
import in.ac.jmi.repositories.UserRepository;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	
	@RequestMapping(value = "/user", params = "add", method = RequestMethod.GET)
	public String getAddUser(Model model) {
		ArrayList<Role> roles = new ArrayList<Role>();

		// From user Add only admin and head of department can be added
		roles.add(Role.ADMIN);
		roles.add(Role.HEAD_OF_DEPARTMENT);
		model.addAttribute("roles", roles);
		model.addAttribute("user", new User());
		return "user/add";
	}

	@RequestMapping(value = "/user", params = "add", method = RequestMethod.POST)
	public String postAddUser(@ModelAttribute @Valid User user,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			System.out.println(result.getAllErrors().toString());

			ArrayList<Role> roles = new ArrayList<Role>();
			roles.add(Role.ADMIN);
			roles.add(Role.HEAD_OF_DEPARTMENT);
			model.addAttribute("roles", roles);
			return "user/add";
		} else {
			System.out.println("Inside postAddUser");
			user = userRepository.save(user);
			return "redirect:user?id=" + user.getId();
		}

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
	public String postEditUser(@ModelAttribute @Valid User user,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			System.out.println(result.getAllErrors().toString());

			ArrayList<Role> roles = new ArrayList<Role>();
			roles.add(Role.ADMIN);
			roles.add(Role.HEAD_OF_DEPARTMENT);
			model.addAttribute("roles", roles);
			return "user/edit";
		} else {
			User newUser = userRepository.findOne(user.getId());

			newUser.setEmailAddress(user.getEmailAddress());
			newUser.setName(user.getName());
			newUser.setRole(user.getRole());

			newUser = userRepository.save(newUser);
			// redirect to view page
			return "redirect:user?id=" + newUser.getId();
		}
	}

	@RequestMapping(value = "/user", params = "delete", method = RequestMethod.POST)
	public String postDeleteUser(@RequestParam long id) {
		userRepository.delete(userRepository.findOne(id));
		return "redirect:adminHome";
	}


}
