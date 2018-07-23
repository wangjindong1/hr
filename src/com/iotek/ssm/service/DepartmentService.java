package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Department;

public interface DepartmentService {

	public Department findDepartmentById(Integer id);

	public void addDepartment(String name);

	public void changeDepartmentById(Department department);

	public List<Department> findAllDepartments();

	public int removeDepartmentById(int id);

}
