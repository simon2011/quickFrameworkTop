package com.simon.quick.dao;

import java.util.Set;

import com.simon.quick.common.BaseDao;
import com.simon.quick.facade.entity.User;

public interface UserDao extends BaseDao<User , Long>   {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertBatch(Set<User> recordList);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}