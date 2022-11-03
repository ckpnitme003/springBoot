package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.bean.Employee;

@Repository("Oradao")
@Profile({"uat","prod","default"})
public class OracleEmployeeDaoImpl implements IEmployeeDao{
	private static final String EMP_BY_DESG="SELECT * FROM EMP WHERE JOB IN(?,?,?)";
	
	@Autowired
	private DataSource ds;
	
	@Override
	public List<Employee> getEmployee(String desg1, String desg2, String desg3)throws Exception {
		
		System.out.println("data source class :"+ds.getClass());
		System.out.println("oracle uat,prod");
		List<Employee> al=new ArrayList<>();
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(EMP_BY_DESG)){
			
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			try(ResultSet rs=ps.executeQuery()){
				
				while(rs.next()) {
					Employee e=new Employee();
					e.setEno(rs.getInt(1));
					e.setEname(rs.getString(2));
					e.setSal(rs.getDouble(3));
					e.setJob(rs.getString(4));
					e.setDeptno(rs.getInt(5));
					
					al.add(e);
					
				}
			}
		}catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return al;
	}
}
