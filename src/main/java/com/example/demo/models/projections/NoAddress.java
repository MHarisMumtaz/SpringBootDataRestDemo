package com.example.demo.models.projections;

import org.springframework.data.rest.core.config.Projection;

import com.example.demo.models.Address;
import com.example.demo.models.Room;

@Projection(name = "withAddress", types = { Room.class })
public interface NoAddress {
	String getTitle();
	String getArea();
	Address getAddress();
}
