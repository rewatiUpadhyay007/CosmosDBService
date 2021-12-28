package com.cosmosdb.cosmosdbappl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cosmosdb.cosmosdbappl.entity.DepartmentUserMetaData;
import com.cosmosdb.cosmosdbappl.model.DepartmentUserMetaDataModel;
import com.cosmosdb.cosmosdbappl.repositories.DepartmentUserMetaDataRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Component
public class DepartmentUserMetaDataService 
{
	@Autowired
	private DepartmentUserMetaDataRepository repository;
	
	public Mono<DepartmentUserMetaData> createDepartmentUserMetaData(DepartmentUserMetaDataModel metadata){
		DepartmentUserMetaData myMetaData=new DepartmentUserMetaData();
		myMetaData.setId(metadata.getId());
		final Mono<DepartmentUserMetaData> saveDepartmentUserMetaDataMono = repository.save(myMetaData);
		return saveDepartmentUserMetaDataMono;
	}
	public Mono<DepartmentUserMetaData> getDepartmentUserMetaData(String Id){
		final Mono<DepartmentUserMetaData> dept = repository.findById(Id);
		return dept;
	}
	
	public Flux<DepartmentUserMetaData> getDepartmentUserMetaData(){
		final Flux<DepartmentUserMetaData> dept = repository.findAll();
		return dept;
	}
}
