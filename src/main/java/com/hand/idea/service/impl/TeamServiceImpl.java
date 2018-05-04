package com.hand.idea.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Event;
import com.hand.idea.domain.Question;
import com.hand.idea.domain.Team;
import com.hand.idea.domain.Teammate;
import com.hand.idea.mapper.TeamMapper;
import com.hand.idea.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuLan on 2018/3/22.
 */
@Service
public class TeamServiceImpl implements TeamService{

    @Autowired
    private TeamMapper teamMapper;

    @Override
    public Integer addTeam(Team team) {

        return teamMapper.insertSelective(team);
    }

    @Override
    public Integer deleteTeam(Integer id) {
        return teamMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateTeam(Team team) {
        return teamMapper.updateByPrimaryKeySelective(team);
    }

    @Override
    public Team selectTeam(Integer id) {
        return teamMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Team> getTeams() {
        return teamMapper.selectByExample(null);
    }

    @Override
    public List<Team> selectScheduleList(Integer eventid) {
        return teamMapper.selectScheduleList(eventid);
    }

    @Override
    public List<Team> selectTeamWithCollection(Integer founderid,Integer eventid) {
        return teamMapper.selectTeamWithCollection(founderid,eventid);
    }

    @Override
    public PageInfo<Team> selectTeamList(String searchContent, Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Team> teamList = teamMapper.selectTeamListByLike(searchContent);
        PageInfo<Team> pageInfo = new PageInfo<Team>(teamList);
        return pageInfo;
    }

    @Override
    public PageInfo<Question> selectQuestionList(Integer teamid, Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Question> listQuestion = teamMapper.selectQuestionList(teamid);
        PageInfo<Question> pageInfo = new PageInfo<Question>(listQuestion);
        return pageInfo;
    }

    @Override
    public List<Teammate> selectTeammateList(Integer teamid) {
        return teamMapper.selectTeammateList(teamid);
    }
}
