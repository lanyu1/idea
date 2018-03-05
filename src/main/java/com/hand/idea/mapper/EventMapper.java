package com.hand.idea.mapper;


import com.hand.idea.domain.Event;
import com.hand.idea.domain.EventExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EventMapper  {
    long countByExample(EventExample example);

    int deleteByExample(EventExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Event record);

    int insertEvent(Event record);

    int insertSelective(Event record);

    int insertSelectiveEvent(Event record);

    List<Event> selectByExample(EventExample example);

    List<Event> selectEventsWithUser(EventExample example);

    List<Event> selectEventByTime(EventExample example);

    List<Event> selectByEventType(Integer type);

    List<Event> searchEvents(@Param("selectWord") String  searchContent);

    Event selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Event record, @Param("example") EventExample example);

    int updateByExample(@Param("record") Event record, @Param("example") EventExample example);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKey(Event record);
}