package com.nt.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.MapKey;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ListIndexBase;

import lombok.Data;

@Entity
@Table(name = "Employee_Info")
@Data
public class EmployeeInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer eid;
	private String ename;
	
	@ElementCollection
	@CollectionTable(name = "nickNames_Info",joinColumns = @JoinColumn(columnDefinition = "Emp_Id",referencedColumnName = "eid"))
	@Column(name = "nickNames")
	@OrderColumn(name = "nickNames_Index")
	@ListIndexBase(1)
	private String[] nickNames;
	
	@ElementCollection
	@CollectionTable(name = "Friends_Info",joinColumns = @JoinColumn(columnDefinition = "Emp_Id",referencedColumnName = "eid"))
	@Column(name = "friends")
	/*@OrderColumn(name = "friend_Index")
	@ListIndexBase(1)*/
	private List<String> friends;
	
	@ElementCollection
	@CollectionTable(name = "PhoneNumber_Info",joinColumns = @JoinColumn(columnDefinition = "Emp_Id",referencedColumnName = "eid"))
	@Column(name = "phoneNumbers")
	private Set<Long> phoneNumbers;
	
	
	@ElementCollection
	@CollectionTable(name = "IdDetails_Info",joinColumns = @JoinColumn(columnDefinition = "Emp_Id",referencedColumnName = "eid"))
	@Column(name = "idDetails")
	@MapKeyColumn(name = "Id_Type")
	private Map<String,Long> idDetails;
	
	
}
