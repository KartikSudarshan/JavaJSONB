package com.app.beans;

import java.util.Date;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.mappers.ObjectMapper;

public class User {
	private int id;
	private String name;
	private String email;
	private Date date;
	private long creditCardNumber;
	public int cvs;
	public int specialnumber;

	// Final Variable can be displayed in json with ease
	public final String USER_TYPE = "admin";

	// Static field is on class level so you will not have it on the user instance
	// so does not appear
	public static int counter = 0;

	// Transient in Java is specifically going to be used in those fields for which
	// serialization should NOT happen so it does not appear
	public transient boolean isMember = false;

	private int getSpecialnumber() {
		return specialnumber;
	}

	private void setSpecialnumber(int specialnumber) {
		this.specialnumber = specialnumber;
	}

	// Default constructor always required as this is the constructor used by JSON B
	public User() {

	}

	public User(int id, String name, String email, Date date) {
		this.date = date;
		this.email = email;
		this.name = name;
		this.id = id;
	}

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
		return "id is " + id + "\nname is " + name + "\nemail is " + email + "\ndate is " + date;
	}

	public static void main(String[] args) {
		User user = new User();
		user.setId(123);
		user.setEmail("test@gmail.com");
		user.setDate(new Date(456789));
		user.setName("JsonTester");

		// Json b will not pick this variable as getters & setters not present and
		// variable is private
		user.creditCardNumber = 456789456;

		// Json b will pick this variable even though getters & setters not present ,
		// variable is public
		user.cvs = 456;

		// Json b will not pick this variable as getters & setters are private
		// eventhough field is public as it respects getters and setters first
		user.specialnumber = 890;
		//Jsonb jsonb = JsonbBuilder.create();
		
		
		Jsonb jsonb = JsonbBuilder.create(ObjectMapper.getObjectMapper());
		//with property visibility strategy settingset to true all private info is available
		
		String result = jsonb.toJson(user);
		System.out.println(result);
	}

}
