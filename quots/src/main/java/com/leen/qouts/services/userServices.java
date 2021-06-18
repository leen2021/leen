package com.leen.qouts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leen.qouts.dao.userDao;
import com.leen.qouts.models.user;

@Service
public class userServices {
	@Autowired
	userDao udao;
	
	public user addUser(user u)
	{
		return udao.save(u);
	}

}
