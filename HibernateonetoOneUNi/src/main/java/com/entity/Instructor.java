package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private int id;
@Column(name="firstname")
private String firstname;
@Column(name="lastname")
private String lastname;
@Column(name="email")
private String email;
@OneToOne
@JoinColumn(name="instructor_detail_id")
private InstructorDetail instructorDetail;

public InstructorDetail getInstructorDetail() {
	return instructorDetail;
}
public void setInstructorDetail(InstructorDetail instructorDetail) {
	this.instructorDetail = instructorDetail;
}
public Instructor()
{
	
}
public Instructor(String firstname, String lastname, String email) {
	super();
	
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
