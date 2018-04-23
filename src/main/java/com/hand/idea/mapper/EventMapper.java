package com.hand.idea.mapper;


import com.hand.idea.domain.Event;
import com.hand.idea.domain.EventExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EventMapper  {
    long countByExample(EventExample example);

    int deleteByExample(EventExample example);

    int deleteByPrimaryKey(@Param("eid") Integer eid);

    int insert(Event record);

    int insertEvent(Event record);

    int insertSelective(Event record);

    int insertSelectiveEvent(Event record);

    Event selectEventByTitle(@Param("title") String title);

    List<Event> selectByExample(EventExample example);

    List<Event> selectEventsWithUser(EventExample example);

    List<Event> selectEventByFounder(Integer founderid);

    List<Event> selectEventByTime(EventExample example);

    List<Event> selectByEventType(Integer type);

    List<Event> searchEvents(@Param("searchContent") String  selectContent,@Param("typeContent") String  typeContent);

    List<Event> searchEventsByLike(@Param("searchContent") String  searchContent);

    Event selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Event record, @Param("example") EventExample example);

    int updateByExample(@Param("record") Event record, @Param("example") EventExample example);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKey(Event record);
}