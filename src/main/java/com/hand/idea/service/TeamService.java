package com.hand.idea.service;

import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Team;

import java.util.List;


/**
 * Created by admin on 2017/12/20.
 */
public interface TeamService {

     public Integer addTeam(Team team);

     public Integer deleteTeam(Integer id);

     public Integer updateTeam(Team team);

     public Team selectTeam(Integer id);

     public List<Team> selectTeamWithCollection(Integer founderid,Integer eventid);

     public PageInfo<Team> selectTeamList(String searchContent, Integer page, Integer pageSize);
}
