package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.DepartmentDao;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public Department findDepartmentById(Integer id) {
		return departmentDao.queryDepartmentById(id);
	}

	@Override
	public void addDepartment(String name) {
		departmentDao.insertDepartment(name);
	}

	@Override
	public void changeDepartmentById(Department department) {
		departmentDao.updateDepartmentById(department);
	}

	@Override
	public List<Department> findAllDepartments() {
		return departmentDao.queryAllDepartments();
	}

	@Override
	public int removeDepartmentById(int id) {
		return departmentDao.deleteDepartmentById(id);
	}

}
