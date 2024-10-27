package com.demo.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String bookName;
	private String author;
	private String author_name;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	@Override
	public String toString() {
		return "User [bookName=" + bookName + ", id=" + id + ", author=" + author + ", author_name=" + author_name
				+ "]";
	}
	public User(String bookName, int id, String author, String author_name) {
		super();
		this.bookName = bookName;
		this.id = id;
		this.author = author;
		this.author_name = author_name;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
