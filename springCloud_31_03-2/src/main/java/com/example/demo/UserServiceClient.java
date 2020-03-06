package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Groups;

@FeignClient("user-service")
public interface UserServiceClient  {
	
	
	@RequestMapping(value="users/{userId}",method = RequestMethod.GET)
	
	public String UserDetails(@PathVariable("userId") int userId);
	
	@RequestMapping(value = "/getAllGroups", method = RequestMethod.GET)
	 public List<Groups> getAllGroups();
	

}
