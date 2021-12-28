package com.cosmosdb.cosmosdbappl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cosmosdb.cosmosdbappl.entity.DepartmentUserMetaData;
import com.cosmosdb.cosmosdbappl.entity.User;
import com.cosmosdb.cosmosdbappl.model.UserModel;
import com.cosmosdb.cosmosdbappl.service.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CosmosDBController {
	@Autowired
	private UserSvcImpl userSvcImpl;
	@Autowired
	private DepartmentUserMetaDataService DepartmentUserMetaDataSvc;

	@PostMapping("/createUser")
	public Mono<User> createUser(@RequestBody UserModel userModel) 
	{		
		return userSvcImpl.createUser(userModel);
	}
	
	@GetMapping("/getUserById/{id}")
	public Mono<User> getMappingUser(@PathVariable Long id) 
	{
		return userSvcImpl.getUser(id); 		
	}
	
	@GetMapping("/getUserByDepartment/{department}")
	public Flux<User> getMappingUser(@PathVariable String department) 
	{
		return userSvcImpl.getUser(department); 		
	}
	
	@GetMapping("/getAllUsers")
	public Flux<User> getMappingUser() 
	{
		return userSvcImpl.getAllUser(); 		
	}
	
	
	@GetMapping("/DepartmentData/{id}")
	public Mono<DepartmentUserMetaData> GetDepartmentMetaData(@PathVariable String id) 
	{
		return DepartmentUserMetaDataSvc.getDepartmentUserMetaData(id);
	}
	
	@GetMapping("/DepartmentData")
	public Flux<DepartmentUserMetaData> GetDepartmentMetaData() 
	{
		return DepartmentUserMetaDataSvc.getDepartmentUserMetaData();
	}

}
