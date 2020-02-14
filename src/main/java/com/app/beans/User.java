package com.app.beans;

import java.util.Date;

public class User {

	//Default constructor always required as this is the constructor used by JSON B
	public User() {
		
	}
	
	public User(int id,String name,String email,Date date) {
		this.date=date;
		this.email=email;
		this.name=name;
		this.id=id;		
	}
	
	private int id;
	private String name;
	private String email;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "id is "+id+"\nname is "+name+"\nemail is "+email+"\ndate is "+date;
	}
	
	
	
}
