package com.hao.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hao.dao.UserMapper;
import com.hao.pojo.User;
import com.hao.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}