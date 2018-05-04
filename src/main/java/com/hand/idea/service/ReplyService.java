package com.hand.idea.service;

import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Reply;

/**
 * Created by J·S_Meisu on 2018/5/4.
 */
public interface ReplyService {

    public PageInfo<Reply> selectReplyList(String searchContent,Integer page, Integer pageSize);

    public Integer addReply(Reply reply);

    public Integer updateReply(Reply reply);

    public Integer deleteReply(Integer id);
}
