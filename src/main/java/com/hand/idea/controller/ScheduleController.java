package com.hand.idea.controller;

import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Question;
import com.hand.idea.domain.Reply;
import com.hand.idea.domain.Schedule;
import com.hand.idea.service.QuestionService;
import com.hand.idea.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yuLan on 2018/3/25.
 */
@CrossOrigin
@RestController
@RequestMapping("schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping(value = "/selectScheduleList",method = RequestMethod.GET)
    public PageInfo<Schedule> selectScheduleList(@RequestParam(value = "searchContent") String  searchContent,
                                           @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                           @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize){

        PageInfo<Schedule> pageInfo =scheduleService.selectScheduleList(searchContent,page,pageSize);
        return pageInfo;
    }

    @RequestMapping(value = "/selectSchedule",method = RequestMethod.GET)
    public Schedule selectSchedule(@RequestParam("id") Integer id) {
        return scheduleService.selectSchedule(id);
    }

    @RequestMapping(value = "/addSchedule",method = RequestMethod.POST)
    public String addSchedule(@RequestBody Schedule schedule){
        scheduleService.addSchedule(schedule);
        return "插入成功";
    }


    @RequestMapping(value = "/deleteSchedule",method = RequestMethod.DELETE)
    public String deleteSchedule(@RequestParam("id") Integer id){
        scheduleService.deleteSchedule(id);
        return "删除成功";
    }


    @RequestMapping(value = "/updateSchedule",method = RequestMethod.PUT)
    public String updateSchedule(@RequestBody Schedule schedule){
        scheduleService.updateSchedule(schedule);
        return "修改成功";
    }
}
