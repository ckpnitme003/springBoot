package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IDeptRepository;
import com.nt.dao.IEmployeeDao;
import com.nt.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao repo;
	@Autowired
	private IDeptRepository deptrepo;
	
	//select all operation
	@Override
	public Iterable<Employee> getAllEmp() {
		System.out.println("EmployeeServiceImpl.getAllEmp()");
		return repo.findAll();
	}
	//insert record(single)
	@Override
	public Employee registerEmp(Employee emp) {
		Employee e = repo.save(emp);
		return e;
	}
	@Override
	public Employee updateEmp(Employee emp) {
		Optional<Employee> opt=repo.findById(emp.getEno());
		Employee e=null;
		if(opt.isPresent()) {
			e=opt.get();
			e.setEname(emp.getEname());
			e.setEaddr(emp.getEaddr());
			e.setJob(emp.getJob());
			e.setSal(emp.getSal());
			e.setDeptNo(emp.getDeptNo());
			
		}
		else
			throw new IllegalArgumentException("Record not found");
		
		Employee e1=repo.save(e);
		return e1;
	}
	@Override
	public Employee GetEmp(Integer eno) {
		Optional<Employee> opt=repo.findById(eno);
		if(opt.isPresent())
			return opt.get();
		else
			throw new IllegalArgumentException("Invalid eno");
	}
	@Override
	public String deleteEmp(Integer eno) {
		repo.deleteById(eno);
		return "Employee is deleted with Id :"+eno;
	}
	
	@Override
	public List<Integer> fetchAllDeptNo() {
		
		return deptrepo.getAllDeptNo();
	}
	@Override
	public boolean isJobInRejectionList(String job) {
		
		if(job.equalsIgnoreCase("clerk"))
			return true;
		else 
			return false;
	}
	

}
