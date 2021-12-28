package com.cosmosdb.cosmosdbappl.repositories;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.cosmosdb.cosmosdbappl.entity.User;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveCosmosRepository<User, String> 
{
	Mono<User> findById(Long id);
	Flux<User> findByDepartment(String Department);
    Flux<User> findAll();
}