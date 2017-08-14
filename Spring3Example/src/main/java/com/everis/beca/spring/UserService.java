package com.everis.beca.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	@Qualifier("pepinos")
	UserDAO userDAO;
	
	public  List<User> getUsers() {
		return userDAO.getUsers();
	}
	
}
