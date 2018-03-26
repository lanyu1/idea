package com.hand.idea.service;

import com.hand.idea.domain.Schedule;

/**
 * Created by yuLan on 2018/3/25.
 */
public interface ScheduleService {

    public Integer addSchedule(Schedule teammate);

    public Integer deleteSchedule(Integer id);

    public Integer updateSchedule(Schedule team);

    public Schedule selectSchedule(Integer id);
}
