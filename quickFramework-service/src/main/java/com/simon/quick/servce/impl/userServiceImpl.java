package com.simon.quick.servce.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.simon.quick.dao.UserDao;
import com.simon.quick.facade.entity.User;
import com.simon.quick.facade.service.IUserService;




@Service("userService")  
public class userServiceImpl implements IUserService {
	private static final Logger logger = LoggerFactory.getLogger(userServiceImpl.class);
	@Resource
	private UserDao userDao;

	@Override
	public User selectByUsername(int id) {
		// TODO Auto-generated method stub
	    logger.info("-------------------call userService");
		return this.userDao.selectByPrimaryKey(id);
	}

}
