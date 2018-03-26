package com.hand.idea.controller;

import com.hand.idea.domain.Question;
import com.hand.idea.domain.Teammate;
import com.hand.idea.service.QuestionService;
import com.hand.idea.service.TeammateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yuLan on 2018/3/25.
 */
@CrossOrigin
@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/selectQuestion",method = RequestMethod.GET)
    public Question selectQuestion(@RequestParam("id") Integer id){
        return questionService.selectQuestion(id);
    }

    @RequestMapping(value = "/addQuestion",method = RequestMethod.POST)
    public String addQuestion(@RequestBody Question question){
        questionService.addQuestion(question);
        return "插入成功";
    }


    @RequestMapping(value = "/deleteQuestion/{id}",method = RequestMethod.GET)
    public String deleteQuestion(@PathVariable("id") Integer id){
        questionService.deleteQuestion(id);
        return "删除成功";
    }


    @RequestMapping(value = "/updateQuestion",method = RequestMethod.PUT)
    public String updateQuestion(@RequestBody Question question){
        questionService.updateQuestion(question);
        return "修改成功";
    }
}
