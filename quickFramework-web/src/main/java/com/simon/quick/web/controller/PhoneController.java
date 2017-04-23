package com.simon.quick.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simon.quick.facade.entity.User;
import com.simon.quick.facade.service.IUserService;
import com.wordnik.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value="/rest")
public class PhoneController {
	
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);

    @Resource  
    private IUserService userService = null;
    
    @RequestMapping(value="/index" ,method = RequestMethod.GET)
    public String index(){
        return "Hello World!";
    }
    
   
    @RequestMapping(value = "/getmap",method = RequestMethod.POST)
    @ApiOperation(value = "根据用户名获取用户对象", httpMethod = "POST", response = User.class, notes = "根据用户名获取用户对象")
    public User getMap(@RequestBody String requestBodyParams){
    	logger.info("---------- "+requestBodyParams);
       System.out.println(requestBodyParams);
        Map<String,String> phoneMap = new HashMap<String,String>();
        phoneMap.put("name", "apple phone");
        phoneMap.put("money", "5000");
        User user = userService.selectByUsername(2);  
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        logger.info(user.getEmail());  
        System.out.println(user.getEmail());
        return user;
    }
}
