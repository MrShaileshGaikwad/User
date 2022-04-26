package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User 
{
	private int userId;
	private String name;
	private String phone;
		
List<Contact> contacts = new ArrayList<>();

//constructer

public User(int userId, String name, String phone, List<Contact> contacts)
{
	super();
	this.userId = userId;
	this.name = name;
	this.phone = phone;
	this.contacts = contacts;
}
// no arg constructer
public User() {
	super();
	// TODO Auto-generated constructor stub
}
// getter and setter
public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public List<Contact> getContacts() {
	return contacts;
}

public void setContacts(List<Contact> contacts) {
	this.contacts = contacts;
}
}
