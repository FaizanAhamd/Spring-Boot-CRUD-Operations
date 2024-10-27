package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entiy.User;
import com.demo.service.Service;

@RestController
public class Controller {
	@Autowired
	private Service service;
	
	
	// get all book
	@GetMapping("/home")
	@ResponseBody
	public List<User>getallbook() {
		return this.service.getAllBook();
	}
	
	// get single book
	@GetMapping("/single/{id}")
	public User getByid(@PathVariable("id")int id) {
		return service.getById(id);
	}
	// sending 1 book
	@GetMapping("/book")
	public  User book()
	{
		User user=new User();
		user.setId(1);
		user.setBookName("java");
		user.setAuthor("java advanvce");
		user.setAuthor_name("cv raman");
		
		return user;
	}
	
	// add book
	@PostMapping("/add")
	public User add(@RequestBody User user) {
	User u=	this.service.addBoo(user);
	System.out.println(user);
		return u; 
	}
	
	// delete book by id
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable ("id") int idb) {
		this.service.deleteBook(idb);
	}
	@PutMapping("/update/{id}")
	public void update(@RequestBody User user,  @PathVariable("id")int id) {
		this.service.update(user,id);
		
	}
}
