package com.cosmosdb.cosmosdbappl.repositories;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.cosmosdb.cosmosdbappl.entity.DepartmentUserMetaData;

import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface DepartmentUserMetaDataRepository extends ReactiveCosmosRepository<DepartmentUserMetaData, String> 
{
    Mono<DepartmentUserMetaData> findById(String id);
    Flux<DepartmentUserMetaData> findAll();
}
