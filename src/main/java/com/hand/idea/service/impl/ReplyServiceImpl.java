package com.hand.idea.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Reply;
import com.hand.idea.mapper.ReplyMapper;
import com.hand.idea.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by J·S_Meisu on 2018/5/4.
 */
@Service
public class ReplyServiceImpl implements ReplyService{

    @Autowired
    private ReplyMapper replyMapper;

    @Override
    public PageInfo<Reply> selectReplyList(String searchContent, Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Reply> listReply = replyMapper.selectReplyList(searchContent);
        PageInfo<Reply> pageInfo = new PageInfo<Reply>(listReply);
        return pageInfo;
    }

    @Override
    public Integer addReply(Reply reply) {
        return replyMapper.insertSelective(reply);
    }

    @Override
    public Integer updateReply(Reply reply) {
        return replyMapper.updateByPrimaryKeySelective(reply);
    }

    @Override
    public Integer deleteReply(Integer id) {
        Reply r = replyMapper.selectByPrimaryKey(id);
        if(r!=null){
          replyMapper.deleteByPrimaryKey(id);
        }
        return -1;
    }


}
