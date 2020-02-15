package com.app.beans;

public class SoftwareDeveloper extends Person{

	private String designation;
	private String company;
	
	
	public SoftwareDeveloper(){
		
	}
	
	public SoftwareDeveloper(String name,String email, String designation, String company) {
		super(name,email);
		this.designation = designation;
		this.company = company;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "SoftwareDeveloper [name ="+super.getName()+", email="+super.getEmail()+", designation=" + designation + ", company=" + company + "]";
	}
	
	
}
