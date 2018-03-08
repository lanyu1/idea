package com.hand.idea.mapper;

import com.hand.idea.domain.User;
import com.hand.idea.domain.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User insertSelective(@Param("record")User record);

    List<User> selectByExample(UserExample example);

    User selectByExampleWithEvent(Integer id);

    User selectByExampleWithHobby(Integer id);

    User selectByPrimaryKey(Integer id);

    User searchOneUser(@Param("email") String email,@Param("password") String password);

    User selectUserOrUnique(@Param("email") String email);

    User searchOneUserByEmail(@Param("email") String email);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}