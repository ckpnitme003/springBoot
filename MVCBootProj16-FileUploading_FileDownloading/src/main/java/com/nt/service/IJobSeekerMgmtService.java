package com.nt.service;

import java.util.List;

import com.nt.entity.JobSeekerInfo;

public interface IJobSeekerMgmtService {
	
	public String registerJS(JobSeekerInfo info);
	public List<JobSeekerInfo> getAllJs();
	
	public String fetchResumePathById(Integer id);
	public String fetchPhotoPathById(Integer id);
}
