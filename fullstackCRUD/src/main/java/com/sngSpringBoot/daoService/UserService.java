package com.sngSpringBoot.daoService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angSprinBoot.dao.UserRepo;
import com.angSpringBoot.entity.User;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

	public User createUser(User user) {
		return userRepo.save(user);
	}
	
	public List<User> createUsers(List<User> users) {
		return userRepo.saveAll(users);
	}

	public User getUserById(int id) {
		return userRepo.findById(id).orElse(null);
	}

	public List<User> getUsers() {
		return userRepo.findAll();
	}

	public User updateUser(User user) {
		User oldUser = null;
		Optional<User> optionaluser = userRepo.findById(user.getId());
		if (optionaluser.isPresent()) {
			oldUser = optionaluser.get();
			oldUser.setName(user.getName());
			oldUser.setAddress(user.getAddress());
			userRepo.save(oldUser);
		} else {
			return new User();
		}
		return user;
	}

	public String deleteUserById(int id) {
		userRepo.deleteById(id);
		return "User got deleted";
	}
}
