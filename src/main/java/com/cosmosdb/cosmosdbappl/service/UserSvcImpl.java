package com.cosmosdb.cosmosdbappl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cosmosdb.cosmosdbappl.entity.User;
import com.cosmosdb.cosmosdbappl.model.UserModel;
import com.cosmosdb.cosmosdbappl.repositories.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Component
public class UserSvcImpl {
	@Autowired
    private UserRepository repository;
	
	public Mono<User> createUser(UserModel userModel){
		User user=new User();
		user.setId(userModel.getId());
		final Mono<User> saveUserMono = repository.save(user);
		return saveUserMono;
	}
	
	
	public Mono<User> getUser(Long Id)
	{
		final Mono<User> idUserFlux = repository.findById(Id);
		return idUserFlux;
	}
	

	public Flux<User> getUser(String Id)
	{
		final Flux<User> idUserFlux = repository.findByDepartment(Id);
		return idUserFlux;
	}

	public Flux<User> getAllUser(){
		final Flux<User> idUserFlux = repository.findAll();
		return idUserFlux;
	}

}
