package com.angSprinBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angSpringBoot.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
