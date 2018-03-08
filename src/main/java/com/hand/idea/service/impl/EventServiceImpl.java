package com.hand.idea.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Event;
import com.hand.idea.mapper.EventMapper;
import com.hand.idea.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/12/18.
 */
@Service
public class EventServiceImpl  implements EventService {

    @Autowired
    private EventMapper eventMapper;

    /**
     * 分页查询所有的event
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Event> selectEvents(Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Event> events = eventMapper.selectByExample(null);
        PageInfo<Event> pageInfo = new PageInfo<Event>(events);
        return pageInfo;
    }

    /**
     * 分页查询所有的event并带有用户信息
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Event> selectEventsWithUser(Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Event> events = eventMapper.selectEventsWithUser(null);
        PageInfo<Event> pageInfo = new PageInfo<Event>(events);
        return pageInfo;
    }

    /**
     * 分页查询所有的event通过event创建的时间
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Event> selectEventByTime(Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Event> events = eventMapper.selectEventByTime(null);
        PageInfo<Event> pageInfo = new PageInfo<Event>(events);
        return pageInfo;
    }

    @Override
    public Event selectEvent(Integer id) {

        return eventMapper.selectByPrimaryKey(id);

    }

    @Override
    public String addEvent(Event event) {
       int result = eventMapper.insertEvent(event);
       String flag = "插入成功";
       if(result!=1){
          flag="插入失败";
       }
        return flag;
    }

    @Override
    public Integer deleteEvent(Integer id) {
        return eventMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateEvent(Event event) {
        return eventMapper.updateByPrimaryKey(event);
    }

    @Override
    public PageInfo<Event> selectByEventType(Integer type, Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Event> events = eventMapper.selectByEventType(type);
        PageInfo<Event> pageInfo = new PageInfo<Event>(events);
        return pageInfo;
    }

    @Override
    public PageInfo<Event> searchEvents(String searchContent, Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Event> events = eventMapper.searchEvents(searchContent);
        PageInfo<Event> pageInfo = new PageInfo<Event>(events);
        return pageInfo;
    }


}