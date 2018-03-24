package com.hand.idea.service.impl;

import com.hand.idea.domain.Team;
import com.hand.idea.mapper.TeamMapper;
import com.hand.idea.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
