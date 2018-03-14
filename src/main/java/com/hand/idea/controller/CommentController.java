package com.hand.idea.controller;



/**
 * Created by yuLan on 2018/3/11.
 */

import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Comment;
import com.hand.idea.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/getComments", method = RequestMethod.GET)
    public PageInfo<Comment> getComments(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                     @RequestParam(value = "pageSize", required = false, defaultValue = "3") Integer pageSize) {
        PageInfo<Comment> pageInfo = commentService.selectComments(page, pageSize);
        return pageInfo;
    }
    @RequestMapping(value = "/addComment", method = RequestMethod.POST)
    public String addEvent(@RequestBody Comment comment) {
        commentService.addComment(comment);
        String flag = "插入成功";
        return flag;
    }
}
