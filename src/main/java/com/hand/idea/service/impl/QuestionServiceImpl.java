package com.hand.idea.service.impl;

import com.hand.idea.domain.Question;
import com.hand.idea.mapper.QuestionMapper;
import com.hand.idea.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
