package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserServiceClient;
import com.example.demo.model.Groups;

@RestController
public class ProxyController {
	
	
	@Autowired
	private UserServiceClient userServiceClient;
	@RequestMapping("/groups")  // first it wiil hit here and now will return getAllGroups()
	public List<Groups> getAllGroups(){
		
		return userServiceClient.getAllGroups();
	}

}
