package com.hand.idea.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.User;
import com.hand.idea.service.UserService;

import javax.swing.plaf.synth.SynthEditorPaneUI;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    
	@Autowired
	private UserService userService;

	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login(@RequestParam("email")String email,
						 @RequestParam("password")String password){
		User user = userService.login(email,password);
		if(user!=null){
          return "1";
		}
       return "-1";
		}
	@RequestMapping(value="/register", method = RequestMethod.POST)
    public String regUser(@RequestBody User user){
		String result = userService.regUser(user);
		return result;
	}
	/**
	 * 根据id来查询用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getUser",method = RequestMethod.GET)
	public User getUser(@RequestParam("id") Integer id){
		return userService.getUser(id);
	}

	/**
	 * 查询所有并分页显示
	 * @return
	 */
	@RequestMapping(value = "/getUsers",method = RequestMethod.GET)
	public List<User> getUsers(@RequestParam(value = "pn", defaultValue = "1") Integer pn){
        // 引入PageHelper分页插件
		// 在查询之前只需要调用,传入页码，以及每页数量
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是分页查询
		List<User> users = userService.getUsers();
		// 使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了.
		// 封装了详细的分页信息,包括我们查询出来的结果,传入连续显示的页数
		PageInfo info = new PageInfo(users, 5);
		return users;
    }

	/**
	 * 查询用户带创意
	 * @return
	 */
	@RequestMapping(value = "/getUsersWithEvent",method = RequestMethod.GET)
	public User getUsersWithEvent(@RequestParam("id") Integer id) {
		return userService.selectUsersWithEvent(id);
	}

	@RequestMapping(value = "/getUsersWithHobby",method = RequestMethod.GET)
	public User getUsersWithHobby(@RequestParam("id") Integer id) {
		return userService.selectByExampleWithHobby(id);
	}
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(@RequestBody User user){
       userService.insert(user);
       return "插入成功";
	}

	/**
	 * 根据用户id删除用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
	public String deleteUser(@PathVariable("id") Integer id){
    	userService.delete(id);
    	return "删除成功";
	}

	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/updateUser",method = RequestMethod.PUT)
	public String updateUser(@RequestBody User user){
		userService.update(user);
		return "修改成功";
	}
}
