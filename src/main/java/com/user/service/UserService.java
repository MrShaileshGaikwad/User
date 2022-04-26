 package com.user.service;

import com.user.entity.User;

public interface UserService {

	public User getUser(Long id);

	public void delete(long mobileNo);

	public void update(long mobileNo, User user);

	public long save(User user);

	
}
