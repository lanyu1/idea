package com.hand.idea.service;
import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Event;

/**
 * Created by admin on 2017/12/18.
 */
public interface EventService {

    public PageInfo<Event> selectEvents(Integer page, Integer pageSize);

    public PageInfo<Event> selectEventsWithUser(Integer page, Integer pageSize);

    public PageInfo<Event> selectEventByTime(Integer page, Integer pageSize);

    public PageInfo<Event> selectEventByFounder(Integer founderid,Integer page, Integer pageSize);

    public Event selectEvent(Integer id);

    public Event selectEventByTitle(String title);

    public String addEvent(Event event);

    public Integer deleteEvent(Integer eid);

    public Integer updateEvent(Event event);

    public PageInfo<Event> selectByEventType(Integer type,Integer page,Integer pageSize);

    public PageInfo<Event> searchEvents(String searchContent,String typeContent,Integer page,Integer pageSize);
}
