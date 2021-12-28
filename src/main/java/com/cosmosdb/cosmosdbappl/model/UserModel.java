package com.cosmosdb.cosmosdbappl.model;

import java.util.Map;

import org.json.JSONObject;


public class UserModel {
	private Long id;
    private String Department;
    private Map<String, String> DepartmentData;
    
    public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		this.Department = department;
	}

	public Map<String, String> getDepartmentData() {
		return DepartmentData;
	}

	public void setDepartmentData(Map<String, String> departmentData) {
		this.DepartmentData = departmentData;
	}

	public UserModel(Long id, String department, Map<String, String> departmentData) {
		super();
		this.id = id;
		this.Department = department;
		this.DepartmentData = departmentData;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
