package com.chason.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chason.dao.UserJpaDao;
import com.chason.bean.User;
import com.chason.service.UserService;

/**
 * 
 * @ClassName UserServiceImpl
 * @author abel
 * @date 2016年11月10日
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserJpaDao userJpaDao;
	/**
	 * 
	 * @param username
	 * @return
	 */
	@Override
	public User getUserByName(String username) {
		return userJpaDao.findByName(username);
	}
}
