package com.hand.idea.service;

import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Question;
import com.hand.idea.domain.Team;
import com.hand.idea.domain.Teammate;

import java.util.List;


/**
 * Created by admin on 2017/12/20.
 */
public interface TeamService {

     public Integer addTeam(Team team);

     public Integer deleteTeam(Integer id);

     public Integer updateTeam(Team team);

     public Team selectTeam(Integer id);

     public List<Team> getTeams();

     public List<Team> selectScheduleList(Integer eventid);

     public List<Team> selectTeamWithCollection(Integer founderid,Integer eventid);

     public PageInfo<Team> selectTeamList(String searchContent, Integer page, Integer pageSize);

     public PageInfo<Question> selectQuestionList(Integer teamid,Integer page, Integer pageSize);

     public List<Teammate> selectTeammateList(Integer teamid);
}
