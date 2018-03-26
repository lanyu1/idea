package com.hand.idea.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
/**
 * 问题墙实体类
 * @author admin
 *
 */
public class Question {
    private Integer id;

    private Integer teamid;

    private Integer questionerid;

    private String content;

    private Date createtime;

    public Question() {
    }

    public Question(Integer id, Integer teamid, Integer questionerid, String content, Date createtime) {
        this.id = id;
        this.teamid = teamid;
        this.questionerid = questionerid;
        this.content = content;
        this.createtime = createtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getQuestionerid() {
        return questionerid;
    }

    public void setQuestionerid(Integer questionerid) {
        this.questionerid = questionerid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}