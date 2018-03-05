package com.hand.idea.service;

import java.util.List;

import com.hand.idea.domain.User;

public interface UserService {

	public List<User> getUsers();

	public User getUser(Integer id);

	public User login(String email,String password);

	public String regUser(User user);

	public Integer insert(User user);

	public Integer delete(Integer id);

	public Integer update(User user);

	public User selectUsersWithEvent(Integer id);

	public User selectByExampleWithHobby(Integer id);
}
