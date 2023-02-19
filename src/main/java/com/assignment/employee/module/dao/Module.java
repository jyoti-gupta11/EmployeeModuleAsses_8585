package com.assignment.employee.module.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "modules")
public class Module {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long moduleid;
	
	@Column(name = "module_name")
	private String moduleName;

	@ManyToOne
	@JoinColumn(name = "emp_id")
	Employee employee;
	
	Module()
	{}
	
	
	
	public Module(long moduleid, String moduleName, Employee employee) {
		super();
		this.moduleid = moduleid;
		this.moduleName = moduleName;
		this.employee = employee;
	}



	public long getModuleid() {
		return moduleid;
	}

	public void setModuleid(long moduleid) {
		this.moduleid = moduleid;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	

}
