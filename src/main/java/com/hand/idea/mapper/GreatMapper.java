package com.hand.idea.mapper;

import com.hand.idea.domain.Great;
import com.hand.idea.domain.GreatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GreatMapper {
    long countByExample(GreatExample example);

    int deleteByExample(GreatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Great record);

    int insertSelective(Great record);

    List<Great> selectByExample(GreatExample example);

    List<Great> selectEidAndUid(@Param("eventid") Integer eventid,@Param("userid") Integer userid);

    Great selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Great record, @Param("example") GreatExample example);

    int updateByExample(@Param("record") Great record, @Param("example") GreatExample example);

    int updateByPrimaryKeySelective(Great record);

    int updateByPrimaryKey(Great record);
}