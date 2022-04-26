package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserDao;
import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService
{
	
	
	//List<User> list=List.of(null, null, null);
	
	

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Autowired
	UserDao userDao;

	
	public long save(User user) {
		return userDao.save(user);
	}

	public void update(long mobileNo, User user) {
		 userDao.update(mobileNo, user);
		
	}

	public void delete(long mobileNo) {
		userDao.delete(mobileNo);
		
	}

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public User getUser(long mobileNo) {
		return userDao.getUser(mobileNo);
	}

	
}