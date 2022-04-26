package com.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.user.entity.User;

@Repository
public interface UserDao {
	 public long save(User user );
	   
	 public void update(long mobileNo, User user);
	 
	public void delete(long mobileNo);
	 
	 public User getUser(long mobileNo);
	   
	   public List<User> getAllUsers();
}
