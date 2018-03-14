package com.hand.idea.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
/**
 * 评论实体类
 * @author admin
 *
 */
public class Comment {
    private Integer id;

    private Integer eventid;

    private Integer commentid;

    private String content;

    private Date commenttime;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEventid() {
        return eventid;
    }

    public void setEventid(Integer eventid) {
        this.eventid = eventid;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd")
    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }
}