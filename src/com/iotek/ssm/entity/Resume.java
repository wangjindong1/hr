package com.iotek.ssm.entity;

public class Resume {
	private Integer id;
	private String name;
	private String sex;
	private int age;
	private String education;
	private int phoneNumber;
	private String email;
	private Department department;
	private Job job;
	private String face;
	private String experience;
	private int hopeSalary;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public int getHopeSalary() {
		return hopeSalary;
	}
	public void setHopeSalary(int hopeSalary) {
		this.hopeSalary = hopeSalary;
	}
	public Resume() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resume(Integer id, String name, String sex, int age, String education, int phoneNumber, String email,
			Department department, Job job, String face, String experience, int hopeSalary) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.education = education;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.department = department;
		this.job = job;
		this.face = face;
		this.experience = experience;
		this.hopeSalary = hopeSalary;
	}
	@Override
	public String toString() {
		return "Resume [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", education=" + education
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", department=" + department + ", job=" + job
				+ ", face=" + face + ", experience=" + experience + ", hopeSalary=" + hopeSalary + "]";
	}

}
