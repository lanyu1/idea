package com.hand.idea.mapper;

import com.hand.idea.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * Created by admin on 2017/12/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testInsertUser(){
        String uid = UUID.randomUUID().toString().substring(0,5);
        User user= new User("18893456798",uid+"@hand.com",uid,1,uid+"idea",20,uid+"photo","上海","唱歌","本人来自上海，是一名IT工程师",null,null);
        userMapper.insert(user);
        System.out.println("插入成功");
    }
}
