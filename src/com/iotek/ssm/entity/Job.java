package com.iotek.ssm.entity;

public class Job {
	private Integer id;
	private String name;//ְλ
	private int level;//ְλȨ�޵ȼ���0Ϊ��ͨԱ����1Ϊ�쵼
	private Department department;//��������
	
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(Integer id, String name, int level, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", name=" + name + ", level=" + level + ", department=" + department + "]";
	}

}
