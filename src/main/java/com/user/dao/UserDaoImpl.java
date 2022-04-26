package com.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.user.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public long save(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(long mobileNo, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long mobileNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(long mobileNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
