package com.hand.idea.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Teammate;
import com.hand.idea.mapper.TeammateMapper;
import com.hand.idea.service.TeammateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuLan on 2018/3/25.
 */
@Service
public class TeammateServiceImpl implements TeammateService{

    @Autowired
    private TeammateMapper teammateMapper;

    @Override
    public Integer addTeammate(Teammate teammate) {

        return teammateMapper.insertSelective(teammate);
    }

    @Override
    public Integer deleteTeammate(Integer id) {

        return teammateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateTeammate(Teammate team)
    {
        return teammateMapper.updateByPrimaryKeySelective(team);
    }

    @Override
    public Teammate selectTeammate(Integer id) {

        return teammateMapper.selectByPrimaryKey(id);
    }

    @Override
    public Teammate selectTeamLeader(Integer teamid) {
        return teammateMapper.selectTeamLeader(teamid);
    }

    @Override
    public PageInfo<Teammate> selectTeammateList(String searchContent,Integer page,Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Teammate> teammateList = teammateMapper.selectTeammateList(searchContent);
        PageInfo<Teammate> pageInfo = new PageInfo<Teammate>(teammateList);
        return pageInfo;
    }
}
