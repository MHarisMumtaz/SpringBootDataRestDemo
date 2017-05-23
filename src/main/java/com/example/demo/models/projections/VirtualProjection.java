package com.example.demo.models.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.example.demo.models.User;

@Projection(name = "withFullName", types = { User.class })
public interface VirtualProjection {
	@Value("#{target.firstName} #{target.lastName}") 
	  String getFullName();
}
