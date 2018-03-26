package com.hand.idea.service.impl;

import com.hand.idea.domain.Schedule;
import com.hand.idea.mapper.ScheduleMapper;
import com.hand.idea.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuLan on 2018/3/25.
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public Integer addSchedule(Schedule schedule) {
        return scheduleMapper.insertSelective(schedule);
    }

    @Override
    public Integer deleteSchedule(Integer id) {
        return scheduleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateSchedule(Schedule schedule) {
        return scheduleMapper.updateByPrimaryKeySelective(schedule);
    }

    @Override
    public Schedule selectSchedule(Integer id) {
        return scheduleMapper.selectByPrimaryKey(id);
    }
}
