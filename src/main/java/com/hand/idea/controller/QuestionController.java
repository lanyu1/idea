package com.hand.idea.controller;

import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Question;
import com.hand.idea.domain.Reply;
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

    @RequestMapping(value = "/selectQuestionList",method = RequestMethod.GET)
    public PageInfo<Question> selectQuestionList(@RequestParam(value = "searchContent") String  searchContent,
                                           @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                           @RequestParam(value = "pageSize", required = false, defaultValue = "2") Integer pageSize){

        PageInfo<Question> pageInfo =questionService.selectQuestionList(searchContent,page,pageSize);
        return pageInfo;
    }

    @RequestMapping(value = "/selectQuestion",method = RequestMethod.GET)
    public Question selectQuestion(@RequestParam("id") Integer id){
        return questionService.selectQuestion(id);
    }

    @RequestMapping(value = "/addQuestion",method = RequestMethod.POST)
    public String addQuestion(@RequestBody Question question){
        questionService.addQuestion(question);
        return "插入成功";
    }


    @RequestMapping(value = "/deleteQuestion",method = RequestMethod.DELETE)
    public String deleteQuestion(@RequestParam("id") Integer id){
        questionService.deleteQuestion(id);
        return "删除成功";
    }


    @RequestMapping(value = "/updateQuestion",method = RequestMethod.PUT)
    public String updateQuestion(@RequestBody Question question){
        questionService.updateQuestion(question);
        return "修改成功";
    }
}
