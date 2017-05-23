package com.example.demo.repositories;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.models.Room;

public interface RoomRepository extends PagingAndSortingRepository<Room, Integer>{
	@RestResource(path = "titleStartsWith", rel = "titleStartsWith")
	public Page findByTitleStartsWith(@Param("title") String title, Pageable page);
}
