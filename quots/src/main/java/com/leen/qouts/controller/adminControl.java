package com.leen.qouts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leen.qouts.models.user;
import com.leen.qouts.services.userServices;

@RestController
public class adminControl {

	@Autowired
	public userServices usr;
	
	@PostMapping("/admin/addUser")
	public user addUser(@RequestBody user u)
	{
		return usr.addUser(u);
	}
}
