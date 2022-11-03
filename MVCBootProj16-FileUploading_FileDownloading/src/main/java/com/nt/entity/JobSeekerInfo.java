package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="boot_js_info")
@Data
public class JobSeekerInfo {

	@Id
	@GeneratedValue
	private Integer jsId;
	private String jsName;
	private String jsAddrs;
	@Column(length = 100)
	private String resumePath;
	@Column(length = 100)
	private String photoPath;
	
}
