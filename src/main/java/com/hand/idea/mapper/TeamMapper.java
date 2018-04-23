package com.hand.idea.mapper;

import com.hand.idea.domain.Team;
import com.hand.idea.domain.TeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamMapper {
    long countByExample(TeamExample example);

    int deleteByExample(TeamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Team record);

    int insertSelective(Team record);

    List<Team> selectTeamListByLike(@Param("searchContent") String  searchContent);

    List<Team> selectByExample(TeamExample example);

    List<Team> selectTeamWithCollection(@Param("founderid") Integer founderid,@Param("eventid") Integer eventid);

    Team selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}