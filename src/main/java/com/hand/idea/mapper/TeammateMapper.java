package com.hand.idea.mapper;

import com.hand.idea.domain.Teammate;
import com.hand.idea.domain.TeammateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeammateMapper {
    long countByExample(TeammateExample example);

    int deleteByExample(TeammateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Teammate record);

    int insertSelective(Teammate record);

    List<Teammate> selectByExample(TeammateExample example);

    List<Teammate> selectTeammateList(@Param("searchContent") String  searchContent);

    Teammate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Teammate record, @Param("example") TeammateExample example);

    int updateByExample(@Param("record") Teammate record, @Param("example") TeammateExample example);

    int updateByPrimaryKeySelective(Teammate record);

    int updateByPrimaryKey(Teammate record);
}