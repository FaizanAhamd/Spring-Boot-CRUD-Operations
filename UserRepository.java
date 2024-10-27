package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.entiy.User;

public interface UserRepository  extends CrudRepository<User, Integer>{
	public User findById(int id);

}
