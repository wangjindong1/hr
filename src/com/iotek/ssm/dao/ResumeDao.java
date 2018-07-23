package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Resume;

public interface ResumeDao {
	
	public void insertResume(Resume resume);
	
	public void deleteResumeById(int id);
	
	public void updateResumeById(Resume resume);
	
	public Resume queryResumeById(int id);
	
	public List<Resume> queryAllResumes();

}
