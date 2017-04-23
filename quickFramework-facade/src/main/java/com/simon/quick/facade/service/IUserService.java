package com.simon.quick.facade.service;

import com.simon.quick.facade.entity.User;

public interface IUserService {
   
	
	User selectByUsername(int username);
}
