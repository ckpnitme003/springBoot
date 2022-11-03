package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeekerInfo;
import com.nt.repository.IJobSeekerInfoRepo;

@Service
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {

	@Autowired
	private IJobSeekerInfoRepo repo;
	@Override
	public String registerJS(JobSeekerInfo info) {
		
		return "Job seeker is registered with id value :"+repo.save(info).getJsId();
	}
	@Override
	public List<JobSeekerInfo> getAllJs() {
		return repo.findAll();
	}
	@Override
	public String fetchResumePathById(Integer id) {
		
		return repo.getResumePathbyId(id);
	}
	@Override
	public String fetchPhotoPathById(Integer id) {
		
		return repo.getPhotoPathbyId(id);
	}
}
