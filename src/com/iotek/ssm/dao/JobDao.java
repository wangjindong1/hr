package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Job;

public interface JobDao {
	
	public void insertJob(Job job);

	public void deleteJobById(int id);
	
	public void updateJobById(Job job);
	
	public List<Job> queryAllJobs();
	
	public Job queryJobById(int id);
}
