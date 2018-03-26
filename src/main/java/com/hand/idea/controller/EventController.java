package com.hand.idea.controller;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.hand.idea.domain.Event;
import com.hand.idea.domain.RequestData;
import com.hand.idea.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by admin on 2017/12/18.
 */
@RestController
@CrossOrigin
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    private RequestData requestData = new RequestData();
    /**
     * 查询所有的创意
     *
     * @return
     */
    @RequestMapping(value = "/getEvents", method = RequestMethod.GET)
    public PageInfo<Event> getEvents(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                     @RequestParam(value = "pageSize", required = false, defaultValue = "6") Integer pageSize) {
        PageInfo<Event> pageInfo = eventService.selectEvents(page, pageSize);
        return pageInfo;
    }
    @RequestMapping(value = "/getEventsByFounderId", method = RequestMethod.GET)
    public PageInfo<Event> getEventsByFounderId(@RequestParam("founderid") Integer founderid,
                                                @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                                @RequestParam(value = "pageSize", required = false, defaultValue = "6") Integer pageSize) {
        PageInfo<Event> pageInfo = eventService.selectEventByFounder(founderid,page,pageSize);
        return pageInfo;
    }
    @RequestMapping(value = "/getEventsWithUser", method = RequestMethod.GET)
    public PageInfo<Event> selectEventsWithUser(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                                @RequestParam(value = "pageSize", required = false, defaultValue = "6") Integer pageSize) {
        PageInfo<Event> pageInfo = eventService.selectEventsWithUser(page, pageSize);
        return pageInfo;
    }

    @RequestMapping(value = "/getEventsByTime", method = RequestMethod.GET)
    public PageInfo<Event> selectEventByTime(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                             @RequestParam(value = "pageSize", required = false, defaultValue = "6") Integer pageSize) {
        PageInfo<Event> pageInfo = eventService.selectEventByTime(page, pageSize);
        return pageInfo;
    }
    @RequestMapping(value = "/selectByTitle", method = RequestMethod.GET)
    public Event selectEventByTitle(@RequestParam("title") String title){

        Event event = eventService.selectEventByTitle(title);

        return event;
    }
    /**
     * 根据创意id查询出创意
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/getEvent", method = RequestMethod.GET)
    public Event getEvent(@RequestParam("id") Integer id) {

        return eventService.selectEvent(id);
    }

    /**
     * 添加创意
     *
     * @param event
     * @return
     */
    @RequestMapping(value = "/addEvent", method = RequestMethod.POST)
    public String addEvent(@RequestBody Event event) {
        eventService.addEvent(event);
        requestData.setMessage("添加成功");
        return new Gson().toJson(requestData);
    }

    /**
     * 根据创意id删除创意
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteEvent/{id}", method = RequestMethod.DELETE)
    public String deleteEvent(@PathVariable("id") Integer id) {
        eventService.deleteEvent(id);
        return "删除成功";
    }

    /**
     * 修改创意信息
     *
     * @param event
     * @return
     */
    @RequestMapping(value = "/updateEvent", method = RequestMethod.PUT)
    public String updateEvent(@RequestBody Event event) {
        eventService.updateEvent(event);
        return "修改成功";
    }

    /**
     * 根据创意类型(type)来搜索创意
     *
     * @param type
     * @return
     */
    @RequestMapping(value = "/getEventType", method = RequestMethod.GET)
    public PageInfo<Event> selectByEventType(@RequestParam("type") Integer type,
                                             @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                             @RequestParam(value = "pageSize", required = false, defaultValue = "6") Integer pageSize) {
        PageInfo<Event> pageInfo = eventService.selectByEventType(type, page, pageSize);
        return pageInfo;
    }
    @RequestMapping(value = "/getSearchEvents", method = RequestMethod.GET)
    public PageInfo<Event> searchEvents(@RequestParam("searchContent") String searchContent,
                                             @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                             @RequestParam(value = "pageSize", required = false, defaultValue = "6") Integer pageSize) {
        PageInfo<Event> pageInfo = eventService.searchEvents(searchContent, page, pageSize);
        return pageInfo;
    }
}

