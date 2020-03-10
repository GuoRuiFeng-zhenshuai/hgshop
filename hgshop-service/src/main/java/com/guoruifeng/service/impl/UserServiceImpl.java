package com.guoruifeng.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.guoruifeng.config.AdminProperties;
import com.guoruifeng.service.UserService;

@Service(interfaceClass=UserService.class,version="1.0.0")
public class UserServiceImpl implements UserService{
	
	@Autowired
	AdminProperties adminPro;

	@Override
	public boolean login(String userName, String passWord) {
		
		// TODO Auto-generated method stub
	
		return (adminPro.getAdminName().equals(userName) 
				&& adminPro.getPassword().equals(passWord));
		
		
	}
}
