package com.store.productcatalogue.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.store.productcatalogue.model.Login;

/**
 * @Author
 * Dhruv Shah
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	//LoginRepository loginRepo;
	
	List<Login> list = Arrays.asList(new Login("admin", "123456", true),
			new Login("user", "123456", false));

	@Override
	public Login loginUser(Login login) {
		for(Login log : list) {
			if(log.getPassword().equals(login.getPassword()) && log.getUsername().equals(login.getUsername())) {
				return log;
			}
		}
		
		return null;
	}

}
