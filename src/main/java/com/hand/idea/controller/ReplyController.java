package com.hand.idea.controller;

import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Reply;
import com.hand.idea.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/reply")
public class ReplyController extends CommonController{

    @Autowired
    private ReplyService replyService;

    @RequestMapping(value = "/selectReplyList",method = RequestMethod.GET)
    public PageInfo<Reply> selectReplyList(@RequestParam(value = "searchContent") String  searchContent,
                                           @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                           @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize){

        PageInfo<Reply> pageInfo =replyService.selectReplyList(searchContent,page,pageSize);
         return pageInfo;
    }
    @RequestMapping(value = "addReply",method = RequestMethod.POST)
    public String addReply(@RequestBody Reply reply){
        replyService.addReply(reply);
        return outMsg(true,"添加成功");
    }
    @RequestMapping(value = "updateReply",method = RequestMethod.PUT)
    public String updateReply(@RequestBody Reply reply){
        replyService.updateReply(reply);
        return outMsg(true,"修改成功");
    }
    @RequestMapping(value = "deleteReply",method = RequestMethod.DELETE)
    public String deleteReply(@RequestParam("id") Integer id){
        replyService.deleteReply(id);
        return outMsg(true,"刪除成功");
    }
}
