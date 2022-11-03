package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepo;

@Service("serviceEmployee")
public class EmployeeMgmtServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepo repo;
	
	@Override
	public String register(Employee e) {
		Employee emp=repo.insert(e);
		return "Employee is saved with Id value ="+emp.getId();
	}
	@Override
	public List<Employee> showAll() {
		
		return repo.findAll();
	}
	@Override
	public String registerMultipleSaveAll(Iterable<Employee> it) {
		List<Employee> li=repo.saveAll(it);
		return li.size()+" element is saved";
	}
	@Override
	public List<Employee> showAllBySortByEno(boolean Asc) {
		Sort s=Sort.by(Asc?Direction.ASC:Direction.DESC, "eno");
		return repo.findAll(s);
	}
	@Override
	public List<Employee> showByExamplePassingProperty(Employee e) {
		Example ex=Example.of(e);
		List<Employee> li=repo.findAll(ex);
		return li;
	}
	@Override
	public String fetchById(String IdVal) {
		Optional<Employee>  opt=repo.findById(IdVal);
		if(opt.isEmpty())
			return "Employee not found with this Id";
		else
			return opt.get().toString();
	}
	@Override
	public String updateSalById(String idVal, Double newSal) {
		Optional<Employee>  opt=repo.findById(idVal);
		if(opt.isEmpty())
			return "Employee not found with this Id";
		else {
			Employee e=opt.get();
			e.setSal(newSal);
			repo.save(e);
			return e.getId()+" is updated successfully";
		}
	}
	@Override
	public String removeById(String idVal) {
		Optional<Employee>  opt=repo.findById(idVal);
		if(opt.isEmpty())
			return "Employee not found with this Id";
		else {
			repo.deleteById(idVal);
			return idVal+" is deleted successfully";
		}
	}
	@Override
	public String updateBulkVaccinated(boolean vaccinated) {
		Employee emp=new Employee();
		emp.setIsVaccinated(vaccinated);
		Example ex=Example.of(emp);
		List<Employee> li=repo.findAll(ex);
		List<Employee> list=new ArrayList<>();
		for(Employee e:li) {
			e.setIsVaccinated(!vaccinated);
			list.add(e);
			
		}
		List<Employee> al=repo.saveAll(list);
		return al.size()+" number of doc is updated successfully";
	}
	

}
