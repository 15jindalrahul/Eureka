package com.example.demo.model.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Groups;

@RestController
public class GroupController {
	
	
	@RequestMapping(value="user/{id}",method=RequestMethod.GET)
	@ResponseBody
	public String getUserById(@PathVariable("id") int id)
	{
		return "UserId"+ id;
		
	}
	
	
	

	@RequestMapping(value = "/getAllGroups", method = RequestMethod.GET)
	@ResponseBody
	public List<Groups> getAllGroups() {
		List<Groups> groups=new ArrayList<Groups>();
		groups.add(new Groups(1, "Groups1"));
		groups.add(new Groups(2, "Groups2"));
		groups.add(new Groups(3, "Groups3"));
		return groups;
	}
	

}
