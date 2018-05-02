package com.hand.idea.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Comment;
import com.hand.idea.mapper.CommentMapper;
import com.hand.idea.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuLan on 2018/3/11.
 */
@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public String addComment(Comment comment) {
        int result = commentMapper.insert(comment);
        String flag = "评论成功";
        if(result!=1){
            flag="评论失败";
        }
        return flag;
    }

    @Override
    public PageInfo<Comment> selectComments(Integer eventid,Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Comment> events = commentMapper.selectCommentWithUser(eventid);
        PageInfo<Comment> pageInfo = new PageInfo<Comment>(events);
        return pageInfo;
    }
}
