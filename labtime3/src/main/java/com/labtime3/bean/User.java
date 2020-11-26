package com.labtime3.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {


	String name;
	String social_name;
	Date birthday;
	@Id
	int code;
	String gender;
	String email;
	String state;
	String city;
	int number_course_access;
	String situation;
	Date vinculation_date;
	
	public User() {
		
	}
	public User(String name, String social_name, Date birthday, int code, String gender, String email, String state,
			String city, int number_course_access, String situation, Date vinculation_date) {
		this.name = name;
		this.social_name = social_name;
		this.birthday = birthday;
		this.code = code;
		this.gender = gender;
		this.email = email;
		this.state = state;
		this.city = city;
		this.number_course_access = number_course_access;
		this.situation = situation;
		this.vinculation_date = vinculation_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSocial_name() {
		return social_name;
	}

	public void setSocial_name(String social_name) {
		this.social_name = social_name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNumber_course_access() {
		return number_course_access;
	}

	public void setNumber_course_access(int number_course_access) {
		this.number_course_access = number_course_access;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public Date getVinculation_date() {
		return vinculation_date;
	}

	public void setVinculation_date(Date vinculation_date) {
		this.vinculation_date = vinculation_date;
	}

}
