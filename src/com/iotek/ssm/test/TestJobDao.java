package com.iotek.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.DepartmentDao;
import com.iotek.ssm.dao.JobDao;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Job;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestJobDao {
	@Autowired
	private JobDao jobDao;
	@Autowired
	private DepartmentDao deptDao;
	
	@Test
	public void testInsertJob() {
		Department department = deptDao.queryDepartmentById(4);
		Job job = new Job();
		job.setName("武装部部长");
		job.setLevel(1);
		job.setDepartment(department);
		jobDao.insertJob(job);
		System.out.println("添加成功");
	}
	
	@Test
	public void testDeleteJobById() {
		jobDao.deleteJobById(6);
		System.out.println("删除成功");
	}
	@Test
	public void testUpdateJobById() {
		Department department = deptDao.queryDepartmentById(3);
		Job job = jobDao.queryJobById(3);
		job.setName("外交部部长");
		job.setLevel(1);
		job.setDepartment(department);
		jobDao.updateJobById(job);
		System.out.println("修改成功");
	}
	@Test
	public void testQueryAllJobs() {
		List<Job> jobs = jobDao.queryAllJobs();
		for (Job job : jobs) {
			System.out.println(job);
		}
	}
}
