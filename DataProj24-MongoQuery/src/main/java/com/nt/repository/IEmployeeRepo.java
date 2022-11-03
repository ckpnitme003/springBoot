package com.nt.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee, String> {
	
	/*//	@Query("{eno:?1}") //invalid
		@Query("{eno:?0}")//valid
		public Employee getEmployeeByeno(Integer eno);
		
		@Query("{sal:{$gt:?0}}")
		public List<Employee> getEmployeeBySal(Double start);*/
	
	
	//projection operation(Scalar)
	@Query(fields = "{id:0,ename:1,addr:1,sal:1}",value = "{addr:?0}")
	public List<Object[]> getEmpByAddrs(String addrs);
	
	//select Entity operation
//	@Query(fields = "{}",value = "{addr:?0}")
	@Query(value = "{addr:?0}")
	public List<Employee> getAllByAddrs(String addrs);
	
//	@Query(value = "{sal:{$gte:?0},sal:{$lte:?1}}")
	@Query(value = "{sal:{$gte:?0,$lte:?1}}")
	public List<Employee> getAllByBySal(Double start,Double end);

	@Query(value = "{$or:[{ename:?0},{ename:?1}]}")
	public List<Employee> getAllByByEname(String name1,String name2);
	
	@Query(value= "{ename : { $regex: ?0 } }")
	public List<Employee> getAllByEnameStartsChar(String ch);
	
	@Query(value ="{ename : { $regex: ?0 } }")
	public List<Employee> getAllByEnameEndsChar(String ch);
	
	@Query(value ="{ename : { $regex: ?0 } }")
	public List<Employee> getAllByEnameContainingChar(String ch);
	
	@Query(value="{sal:{$gte:?0,$lte:?1}}",count = true)
	public int getCountOfEmpBySal(double start,double end);
	
//	@Query(value="{}",sort = "{ename:1}")  //ascending
	@Query(value="{}",sort = "{ename:-1}") //decending
	public List<Employee> showAllByEnameSort();
	
	@Query(value="{isVaccinated:null}",exists = true)
	public boolean doesEmpExistWithIsvaccinatedIsNull();
	
	@Query(value="{sal:{$gte:?0,$lte:?1}}",delete = true)
	public int removeEmpWithInSalRange(double start,double end);
	
	
	
}