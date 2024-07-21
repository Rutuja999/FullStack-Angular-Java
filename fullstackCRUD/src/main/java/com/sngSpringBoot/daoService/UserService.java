package com.sngSpringBoot.daoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angSprinBoot.dao.UserRepo;
import com.angSpringBoot.entity.User;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	public List<User> createUser(List<User> user) {
		return userRepo.saveAll(user);
	}
	public User getUserById(int id) {
		return userRepo.findById(id).orElse(null);
	}
}
