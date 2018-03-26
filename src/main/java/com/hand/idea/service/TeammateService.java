package com.hand.idea.service;

import com.hand.idea.domain.Teammate;

/**
 * Created by yuLan on 2018/3/25.
 */
public interface TeammateService {

    public Integer addTeammate(Teammate teammate);

    public Integer deleteTeammate(Integer id);

    public Integer updateTeammate(Teammate team);

    public Teammate selectTeammate(Integer id);
}
