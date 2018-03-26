package com.hand.idea.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.hand.idea.domain.RequestData;
import com.hand.idea.domain.User;
import com.hand.idea.mapper.UserMapper;
import com.hand.idea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

import javax.swing.plaf.synth.SynthEditorPaneUI;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private TemplateEngine templateEngine;

	@Value("${spring.mail.username}")
	private String sender;


	private RequestData requestData = new RequestData();

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestBody User user) {
		List<User> users = userService.getUsers();
		for (User u : users) {
			if (u != null && u.getPassword().equals(user.getPassword()) && u.getEmail().equals(user.getEmail())) {
				if (u.getEmailStateId() == 0) {
					requestData.setCode("9999");
					requestData.setState("500");
					requestData.setMessage("请前往" + user.getEmail() + "邮箱激活");
					return new Gson().toJson(requestData);
				}
				requestData.setMessage("登录成功");
				return new Gson().toJson(requestData);
			}
		}
		requestData.setCode("9999");
		requestData.setState("500");
		requestData.setMessage("邮箱不存在或者密码错误");
		return new Gson().toJson(requestData);


	}

	@RequestMapping(value = "activation/{userId}", method = RequestMethod.GET)
	public void activation(@PathVariable("userId") String userId, HttpServletResponse response) throws IOException {
		User user = userService.selectWithUserId(userId);
		if (user != null) {
			user.setEmailStateId(1);
			userService.update(user);
		}
		response.sendRedirect("../../success.html");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String regUser(@RequestBody User user) {
		List<User> users = userService.getUsers();
		for (User u : users) {
			if (u.getEmail() == user.getEmail()) {
				requestData.setMessage("该邮箱已经被注册！");
				requestData.setState("400");
				return new Gson().toJson(requestData);
			}
				// 发送注册邮件
				String userId = UUID.randomUUID().toString().replace("-", "");
				user.setUserId(userId);
				userService.insert(user);
				sendTemplateMail(user.getEmail(), user.getUserId());
				requestData.setMessage("注册成功, 快去激活");
				return new Gson().toJson(requestData);

		}
		return null;
	}

	@RequestMapping(value = "/forget", method = RequestMethod.POST)
	public String forget(@RequestBody User user) {
		List<User> users = userService.getUsers();
		for(User u : users) {
			if(u!=null || u.getEmail()== user.getEmail()) {
				user.setPassword("666666");
				userService.update(user);
				requestData.setMessage("密码已经重置，快去查看你的邮箱");
				sendSimpleEmail(u.getEmail(), "您好，您密码已重置，初始密码：666666，为了你的安全请尽快修改密码。");
				return new Gson().toJson(requestData);
			}
		}
		requestData.setCode("9999");
		requestData.setState("500");
		requestData.setMessage("无效邮箱");
		return new Gson().toJson(requestData);
	}
	public void sendSimpleEmail(String recipient,String text) {
		SimpleMailMessage message = new SimpleMailMessage();
		// 发送者
		message.setFrom(sender);
		// 接收者
		message.setTo(recipient);
		//邮件主题
		message.setSubject("开始吧密码重置邮件");
		// 邮件内容
		message.setText(text);
		javaMailSender.send(message);
	}
	public void sendTemplateMail(String recipient,String userId) {
		MimeMessage message = javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setFrom(sender);
			helper.setTo(recipient);
			helper.setSubject("开始吧邮箱验证邮件");
			Context context = new Context();
			context.setVariable("id", userId);
			String emailContent = templateEngine.process("emailTemplate", context);
			helper.setText(emailContent, true);
		} catch (MessagingException e) {
			throw new RuntimeException("Messaging  Exception !", e);
		}
		javaMailSender.send(message);
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
	 * 根据邮箱查询用户信息
	 * @param email
	 * @return
	 */
	@RequestMapping(value = "/getUserByEmail",method = RequestMethod.GET)
	public User getUser(@RequestParam("email") String email){
		return userService.selectUserByEmail(email);
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
