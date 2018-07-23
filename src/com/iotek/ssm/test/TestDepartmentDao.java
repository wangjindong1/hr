package com.iotek.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.DepartmentDao;
import com.iotek.ssm.entity.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDepartmentDao {
	@Autowired
	private DepartmentDao departmentDao;

	@Test
	public void testQueryAllDepartments() {
		List<Department> departments = departmentDao.queryAllDepartments();
		for (Department department : departments) {
			System.out.println(department);
		}
	}
	
	@Test
	public void testQueryDepartmentById() {
		Department department = departmentDao.queryDepartmentById(2);
		System.out.println(department);
	}
	
	@Test
	public void testInsertDepartment() {
		departmentDao.insertDepartment("小卖部");
		System.out.println("添加成功");
	}
	
	@Test
	public void testDeleteDepartmentById() {
		departmentDao.deleteDepartmentById(5);
		System.out.println("删除成功");
	}
	
	@Test
	public void testUpdateDepartmentById() {
		Department department = departmentDao.queryDepartmentById(4);
		department.setName("武装部");
		departmentDao.updateDepartmentById(department);
		System.out.println("修改成功");
	}
}
