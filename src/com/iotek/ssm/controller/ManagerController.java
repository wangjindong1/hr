package com.iotek.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.ssm.entity.Department;
import com.iotek.ssm.service.DepartmentService;

@RequestMapping("/manager")
@Controller
public class ManagerController {
	@Resource
	private DepartmentService departmentService;
	
	@RequestMapping("/jumpDept")
	public String jumpDept() {
		return "manager/dept";
	}
	
	@RequestMapping("/deptInput")
	public String deptInput(ModelMap model,Integer id) {
		if(id != null) {
			Department department = departmentService.findDepartmentById(id);
			model.addAttribute("department", department);
		}
		return "manager/inputDept";
	}
	
	@RequestMapping("/insertDept")
	public String insertDept(Department department,Integer id) {
		if(id == null) {
			String name = department.getName();
			departmentService.addDepartment(name);
		}else {
			System.out.println("修改");
			department.setName(department.getName());
			System.out.println(department.getName());
			departmentService.changeDepartmentById(department);
		}
		return "redirect:/manager/queryAllDepts";
	}
	
	@RequestMapping("/queryAllDepts")
	public String queryAllDepts(ModelMap model) {
		List<Department> departments = departmentService.findAllDepartments();
		model.addAttribute("departments", departments);
		return "manager/allDepts";
	}

	@RequestMapping("/deleteDeptById")
	@ResponseBody
	public String deleteDeptById(int id) {
		int res = departmentService.removeDepartmentById(id);
		return res>0?"success":"error";
	}
}
