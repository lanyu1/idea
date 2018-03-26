package com.hand.idea.service;

import com.hand.idea.domain.Question;

/**
 * Created by yuLan on 2018/3/25.
 */
public interface QuestionService {

    public Integer addQuestion(Question question);

    public Integer deleteQuestion(Integer id);

    public Integer updateQuestion(Question question);

    public Question selectQuestion(Integer id);
}
