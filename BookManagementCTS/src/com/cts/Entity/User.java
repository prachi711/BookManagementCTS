package com.cts.Entity;

import javax.persistence.Entity;

@Entity
public class User {

	
	private String userName;
	
	private String Name;
	
	

	private String Password;
	
	private String DOB;
	
	private String Address;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		Password = password;
	}
	public User(String userName, String name, String password, String dOB, String address) {
		super();
		this.userName = userName;
		Name = name;
		Password = password;
		DOB = dOB;
		Address = address;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", Name=" + Name + ", Password=" + Password + ", DOB=" + DOB
				+ ", Address=" + Address + "]";
	}
	
	
	
}
