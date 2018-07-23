package com.iotek.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iotek.ssm.entity.Department;

@Repository
public interface DepartmentDao {
	
	public List<Department> queryAllDepartments();
	
	public Department queryDepartmentById(int id);
	
	public void insertDepartment(String name);
	
	public int deleteDepartmentById(int id);
	
	public void updateDepartmentById(Department department);

}
