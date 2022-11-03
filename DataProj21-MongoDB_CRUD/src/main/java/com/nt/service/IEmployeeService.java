package com.nt.service;

import java.util.List;


import com.nt.document.Employee;

public interface IEmployeeService {
	
	public String register(Employee e);
	public List<Employee> showAll();
	public String registerMultipleSaveAll(Iterable<Employee> it);
	public List<Employee> showAllBySortByEno(boolean Asc);
	public List<Employee> showByExamplePassingProperty(Employee e);
	public String fetchById(String IdVal);
	public String updateSalById(String idVal,Double newSal);
	public String removeById(String idVal);
	public String updateBulkVaccinated(boolean vaccinated);
}
