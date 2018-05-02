package com.hand.idea.service;

import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Comment;

/**
 * Created by yuLan on 2018/3/11.
 */
public interface CommentService {

    public String addComment(Comment comment);

    public PageInfo<Comment> selectComments(Integer eventid,Integer page, Integer pageSize);

    public PageInfo<Comment> selectComments(String searchContent,Integer page, Integer pageSize);

    public Integer deleteComment(Integer id);
}
