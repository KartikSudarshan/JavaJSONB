package com.app.beans;

public class Professor extends Person {

	
	
	
	private String degree;
	private String specialization;
	
	public Professor() {
		
	}
	
	
	public Professor(String name, String email,String degree,String specialization) {
		super(name, email);
		this.degree=degree;
		this.specialization=specialization;
	}
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	@Override
	public String toString() {
		return "Professor [name ="+super.getName()+", email="+super.getEmail()+", degree=" + degree + ", specialization=" + specialization + "]";
	}
	

}
