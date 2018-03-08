package com.hand.idea.service.impl;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hand.idea.domain.User;
import com.hand.idea.mapper.UserMapper;
import com.hand.idea.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  
	@Autowired
	private UserMapper userMapper;

	public User login(String email, String password) {
		if (email == null && email=="" && password == null && password=="" ) {
			return null;
		} else {
			//通过邮箱来判断用户是否唯一
			User user = userMapper.selectUserOrUnique(email);
			if (user!=null) {
				if(user.getPassword().equals(password)){
					//通过邮箱和密码来判断用户是否存在
					User userUnique = userMapper.searchOneUser(email,password);
					return userUnique;
				}else{
					return null;
				}
			}else{
				return null;
			}
		}
	}

	@Override
	public User selectUserByEmail(String email) {
		return userMapper.searchOneUserByEmail(email);
	}

	@Override
	public String regUser(User user) {
		if (user.getEmail() != null && user.getNikeName() != null && user.getPassword() != null) {
			if (userMapper.selectUserOrUnique(user.getEmail())==null) {
				userMapper.insert(user);
                return "1";
			} else {
				return "-1";
			}
		} else {
			return "0";
		}
	}

	@Override
	public List<User> getUsers() {
		
		List<User> users= userMapper.selectByExample(null);
		return users;
	}

	@Override
	public User getUser(Integer id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

	@Override
	public Integer insert(User user) {
		return userMapper.insert(user);
	}

	@Override
	public Integer delete(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer update(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	/**
	 * 查询用户带创意
	 * @return
	 */
	@Override
	public User selectUsersWithEvent(Integer id) {
		return userMapper.selectByExampleWithEvent(id);
	}

	@Override
	public User selectByExampleWithHobby(Integer id) {
		return userMapper.selectByExampleWithHobby(id);
	}

}