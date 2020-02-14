package com.app.beans;

import javax.json.bind.annotation.JsonbProperty;

public class Customer {

	@JsonbProperty(value="id") private int customerId;
	 private String customerNamel;
	private String emailAddress;
	private boolean isPrimeUser;
	
	public Customer() {
		
	}
	
	public Customer(int customerId, String customerNamel, String emailAddress, boolean isPrimeUser) {
		super();
		this.customerId = customerId;
		this.customerNamel = customerNamel;
		this.emailAddress = emailAddress;
		this.isPrimeUser = isPrimeUser;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	//works only in deserialization
	@JsonbProperty(value="name")
	public String getCustomerNamel() {
		return customerNamel;
	}
	
	//works only in deserialization 
	@JsonbProperty(value="name")
	public void setCustomerNamel(String customerNamel) {
		this.customerNamel = customerNamel;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public boolean isPrimeUser() {
		return isPrimeUser;
	}

	public void setPrimeUser(boolean isPrimeUser) {
		this.isPrimeUser = isPrimeUser;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerNamel=" + customerNamel + ", emailAddress="
				+ emailAddress + ", isPrimeUser=" + isPrimeUser + "]";
	}
	
	
	
}
