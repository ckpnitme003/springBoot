package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.entity.Employee;
import com.nt.entity.Person;
import com.nt.repository.ICustomerRepo;
import com.nt.repository.IEmployeeRepo;
import com.nt.repository.IPersonRepo;

@Service("personMgmtService")
public class PersonMgmtServiceImpl implements IPersonMgmtService {

	@Autowired
	private IPersonRepo perRepo;
	
	@Autowired
	private IEmployeeRepo empRepo;
	
	@Autowired
	private ICustomerRepo custRepo;
	
	
	@Override
	public String saveDataByPerson(Person p) {
		Person per=perRepo.save(p);
		
		return per.getPid()+ " id value Person is saved";
	}
	@Override
	public String saveDataByEmployee(Employee e) {
		Employee emp=empRepo.save(e);
		return emp.getPid()+" id value Employee is saved";
	}
	@Override
	public String saveDataByCustomer(Customer c) {
		Customer cm=custRepo.save(c);
		return cm.getPid()+"id value Customer is saved ";
	}
	@Override
	public Iterable<Person> getAlldata() {
			Iterable<Person> it=perRepo.findAll();
		return it;
	}
}
