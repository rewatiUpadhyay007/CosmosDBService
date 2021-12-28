package com.cosmosdb.cosmosdbappl.entity;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.data.annotation.Id;

@Container(containerName = "User")
public class User {
    @Id
    private Long id;
    private String department;
    private Map<String, String> departmentData;
  
	public User(Long id, String department, Map<String, String> departmentData) {
		super();
		this.id = id;
		this.department = department;
		this.departmentData = departmentData;
	}
	public User() 
	{
		super();
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

  public Map<String, String> getDepartmentData() {
		return departmentData;
	}
	public void setDepartmentData(Map<String, String> departmentData) {
		this.departmentData = departmentData;
	}
	
}