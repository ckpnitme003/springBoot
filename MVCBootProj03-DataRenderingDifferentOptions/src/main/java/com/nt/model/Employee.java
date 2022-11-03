package com.nt.model;

public class Employee {
	
	private Integer eno;
	private String ename;
	private Double sal;
	private Boolean isVaccinated;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer eno, String ename, Double sal, Boolean isVaccinated) {
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.isVaccinated = isVaccinated;
	}
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Boolean getIsVaccinated() {
		return isVaccinated;
	}
	public void setIsVaccinated(Boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", isVaccinated=" + isVaccinated + "]";
	}
	

	
}
