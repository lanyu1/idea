package com.hand.idea.controller;

import com.hand.idea.domain.Event;
import com.hand.idea.domain.Great;
import com.hand.idea.mapper.EventMapper;
import com.hand.idea.service.EventService;
import com.hand.idea.service.GreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yuLan on 2018/3/22.
 */
@CrossOrigin
@RestController
@RequestMapping("great")
public class GreatController {

    @Autowired
    private GreatService greatService;

    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/selectGreat",method = RequestMethod.GET)
    public String selectGreat(@RequestParam("eventid") Integer eventid,
                              @RequestParam("userid") Integer userid){
        List<Great> list = greatService.selectGreatEidAndUid(eventid,userid);
        if(list!=null && list.size()>0){
            //如果找到了这条记录，则删除该记录，同时文章的点赞数减1
            Great great = list.get(0);
            //删除记录
            greatService.delete(great.getId());
            //文章点赞数减1
            Event event = eventService.selectEvent(eventid);
            event.setSupport(event.getSupport()-1);
            eventService.updateEvent(event);
            return "已经支持了";
        }else{
            //如果没有找到这条记录，则添加这条记录，同时文章点赞数加1
            Great great = new Great();
            great.setEventid(eventid);
            great.setUserid(userid);
            greatService.save(great);
            Event event = eventService.selectEvent(eventid);
            event.setSupport(event.getSupport()+1);
            eventService.updateEvent(event);
            return "支持成功！";
        }
    }

}
