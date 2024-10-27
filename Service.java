package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.entiy.User;
import com.demo.repository.UserRepository;
@Component
public class Service {
	//  create fack databases;
	/*private static ArrayList<User> list=new ArrayList<>();
static {
	list.add(new User("java8",2,"jav8","xyz"));
	list.add(new User("java9",3,"jav9","xyz1"));
	list.add(new User("java10",4,"jav10","xyz2"));

}*/
	@Autowired
	private UserRepository userRepository;
// get all book
public List<User> getAllBook(){
	List<User>list=(List<User>)this.userRepository.findAll();
	return list;
}
//get by id book
public User getById(int id ) {
//User user=	list.stream().filter(e->e.getId()==id).findFirst().get();
	User user=  this.userRepository.findById(id);
	return user;
}

// adding book

public User addBoo(User user) {
	// TODO Auto-generated method stub
User result=	userRepository.save(user);
	//list.add(user);
	return result;
}
 public void deleteBook(int id ) {
	// list.stream().filter(e ->e.getId()!=id).collect(Collectors.toList());
	 userRepository.deleteById(id);
 }
public void update(User user, int id) {
	// TODO Auto-generated method stub
/*	list.stream().map(e ->{
	if (e.getId()==id) {
		e.setBookName(user.getBookName());
		e.setAuthor_name(user.getAuthor());
	}	
	return e;
	}).collect(Collectors.toList());
*/
	user.setId(id);
	userRepository.save(user);
	
}
}

