package com.example.demo.repositories;
import java.awt.print.Pageable;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
import com.example.demo.models.*;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends  CrudRepository<User, Integer>{
	
	List<User> findByFirstNameEndsWith(@Param("firstName") String firstName);
	 
//	 @RestResource(path = "nameStartsWith", rel = "nameStartsWith")
//	 public Page findByNameStartsWith(@Param("name") String name, Pageable p);
}

