package com.hand.idea.controller;

import com.hand.idea.domain.Question;
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

    @RequestMapping(value = "/selectSchedule",method = RequestMethod.GET)
    public Schedule selectSchedule(@RequestParam("id") Integer id) {
        return scheduleService.selectSchedule(id);
    }

    @RequestMapping(value = "/addSchedule",method = RequestMethod.POST)
    public String addSchedule(@RequestBody Schedule schedule){
        scheduleService.addSchedule(schedule);
        return "插入成功";
    }


    @RequestMapping(value = "/deleteQuestion/{id}",method = RequestMethod.GET)
    public String deleteSchedule(@PathVariable("id") Integer id){
        scheduleService.deleteSchedule(id);
        return "删除成功";
    }


    @RequestMapping(value = "/updateQuestion",method = RequestMethod.PUT)
    public String updateSchedule(@RequestBody Schedule schedule){
        scheduleService.updateSchedule(schedule);
        return "修改成功";
    }
}
