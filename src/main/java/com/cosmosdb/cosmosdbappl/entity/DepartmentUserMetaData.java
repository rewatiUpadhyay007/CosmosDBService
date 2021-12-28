package com.cosmosdb.cosmosdbappl.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;

@Container(containerName = "DepartmentUserMetaData")
public class DepartmentUserMetaData 
{
	 @Id
	private String id;
	private List<String> metaDataColumns;
	
	public DepartmentUserMetaData(String id, List<String> metaDataColumns) 
	{
		super();
		this.id = id;
		this.metaDataColumns = metaDataColumns;
	}
	public DepartmentUserMetaData() 
	{
		super();
	}
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public List<String> getMetaDataColumns() 
	{
		return metaDataColumns;
	}
	public void setMetaDataColumns(List<String> metaDataColumns) 
	{
		this.metaDataColumns = metaDataColumns;
	}
	@Override
    public String toString() {
        return String.format("%s", id);
    }
}
