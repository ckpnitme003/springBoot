package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepo;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@Service("EmployeeService")
public class EmployeeMgmtService implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepo repo;
	
	@Override
	public Page<Employee> showEmpByPageNumber(int pageno, int pagesize) {
		
		Pageable pageable =  PageRequest.of(pageno, pagesize);
		Page p=repo.findAll(pageable);
		return p;
	}
	@Override
	public void showEmployeeByPage(int pagesize) {
		
		List<Employee> li=repo.findAll();
		int count=li.size();
		int pagecount=count/pagesize;
		 pagecount=(count%pagesize==0)?pagecount:pagecount+1;
		
		for(int i=0;i<pagecount;i++) {
			System.out.println("======page Number :"+(i+1)+" ==========");
			Pageable pageable=PageRequest.of(i, pagesize);
			Page page=repo.findAll(pageable);
			List<Employee> liEmp=page.getContent();
			liEmp.forEach(emp->System.out.println(emp));
		}
		
	}

}
