package com.everis.beca.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("pepinos")
public class MySQLUserDAO implements UserDAO {

	public List<User> getUsers() {
		User user = new User();
		List<User> users = new ArrayList<User>();
		users.add(user);
		return users;
	}

}
