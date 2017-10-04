package com.everis.alicante.becajava.interfaces;

import com.everis.alicante.becajava.domain.User;

public interface UserDAO {
	
	void insertUser(User user);
	
	User findUserById(int id);
	
	void modifyUser(User user);
	
	User findUserByName(String name);

}
