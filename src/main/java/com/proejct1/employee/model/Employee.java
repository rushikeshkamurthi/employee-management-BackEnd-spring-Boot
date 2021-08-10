package com.proejct1.employee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee implements Serializable{

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(updatable = false , nullable = false)
private Long id;
private  String name;
private String email;
private String jobTitle;
private String phone;
private String imageUrl;

@Column(updatable = false , nullable = false)

private String empCode;


public Employee() {}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobTitle=" + jobTitle + ", phone=" + phone
			+ ", imageUrl=" + imageUrl + ", empCode=" + empCode + "]";
}

public Employee(Long id, String name, String email, String jobTitle, String phone, String imageUrl, String empCode) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.jobTitle = jobTitle;
	this.phone = phone;
	this.imageUrl = imageUrl;
	this.empCode = empCode;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
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

public String getJobTitle() {
	return jobTitle;
}

public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getImageUrl() {
	return imageUrl;
}

public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}

public String getEmpCode() {
	return empCode;
}

public void setEmpCode(String empCode) {
	this.empCode = empCode;
}







	
}
