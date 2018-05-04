package com.hand.idea.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.idea.domain.Question;
import com.hand.idea.domain.Reply;
import com.hand.idea.mapper.QuestionMapper;
import com.hand.idea.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuLan on 2018/3/25.
 */
@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public Integer addQuestion(Question question) {
        return questionMapper.insertSelective(question);
    }

    @Override
    public Integer deleteQuestion(Integer id) {

        return questionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateQuestion(Question question) {

        return questionMapper.updateByPrimaryKeySelective(question);
    }

    @Override
    public Question selectQuestion(Integer id) {

        return questionMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<Question> selectQuestionList(String searchContent, Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Question> listQuestion = questionMapper.selectQuestionList(searchContent);
        PageInfo<Question> pageInfo = new PageInfo<Question>(listQuestion);
        return pageInfo;
    }
}
