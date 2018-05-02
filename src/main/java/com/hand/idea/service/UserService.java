package com.hand.idea.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.User;

public interface UserService {

	public PageInfo<User> selectUsers( String searchContent,Integer page, Integer pageSize);

	public List<User> getUsers();

	public User getUser(Integer id);

	public User login(User user);

    public User selectPermissionByUserId(String userId);

	public User selectUserByEmail(String email);

	public User selectWithUserId(String userId);

	public String regUser(User user);

	public Integer insert(User user);

	public Integer delete(Integer id);

	public Integer update(User user);

	public User selectUsersWithEvent(Integer id);

	public User selectByExampleWithHobby(Integer id);
}
