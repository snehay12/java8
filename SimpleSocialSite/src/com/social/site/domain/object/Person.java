package com.social.site.domain.object;

import java.util.Date;

public class Person {

	private String name;
	private Integer age;

	private static enum Sex {
		FEMALE, MALE
	};

	public String gender;
	private Date birthday;
	private String email;

	public Person() {
	}

	public Person(String name, Integer age, String gender, Date birthday, String email) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.birthday = birthday;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void printPerson() {
		System.out
				.println("Name: " + name + "\n Age: " + age + "\n Gender: " + gender + "\n E-mail: " + email + "\n\n");
	}
	
	@Override
	public String toString()
	{
		return "Name: " + name + "\n Age: " + age + "\n Gender: " + gender + "\n E-mail: " + email + "\n\n";
	}
}
