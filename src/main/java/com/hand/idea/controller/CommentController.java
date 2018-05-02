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
public class CommentController extends CommonController{
    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/getComments", method = RequestMethod.GET)
    public PageInfo<Comment> getComments(@RequestParam(value = "eventid") Integer eventid,
                                         @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                         @RequestParam(value = "pageSize", required = false, defaultValue = "3") Integer pageSize) {
        PageInfo<Comment> pageInfo = commentService.selectComments(eventid,page, pageSize);
        return pageInfo;
    }
    @RequestMapping(value = "/selectComments", method = RequestMethod.GET)
    public PageInfo<Comment> selectComments(@RequestParam(value="searchContent",required = false) String searchContent,
                                         @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                         @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize) {
        PageInfo<Comment> pageInfo = commentService.selectComments(searchContent,page, pageSize);
        return pageInfo;
    }
    @RequestMapping(value = "/addComment", method = RequestMethod.POST)
    public String addComment(@RequestBody Comment comment) {
        commentService.addComment(comment);
        return outMsg(true,"添加成功");
    }
    @RequestMapping(value = "/deleteComment", method = RequestMethod.DELETE)
    public String deleteComment( Integer id) {
        commentService.deleteComment(id);
        return outMsg(true,"删除成功");
    }
}
