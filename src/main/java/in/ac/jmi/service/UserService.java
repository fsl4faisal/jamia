package in.ac.jmi.service;

import in.ac.jmi.entities.User;
import in.ac.jmi.repositories.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUser() {
		return userRepository.findAll();

	}

}
