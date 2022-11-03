package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDao;
import com.nt.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao repo;
	
	//select all operation
	@Override
	public Iterable<Employee> getAllEmp() {
		System.out.println("EmployeeServiceImpl.getAllEmp()");
		return repo.findAll();
	}
	//select pagewise(Paging)
	@Override
	public List<Employee> getEmpByPageNo(int pageNo) {
		System.out.println("EmployeeServiceImpl.getEmpByPageNo()");
		Pageable pageable=PageRequest.of(pageNo, 3);
		
		Page<Employee> page=repo.findAll(pageable);
		return page.getContent();
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
	public Page<Employee> getEmpsByPage(Pageable pageable) {
		return repo.findAll(pageable);
	}
	

}
