package com.hand.idea.domain;

import java.util.Date;
/**
 * 回复实体类
 * @author admin
 *
 */
public class Reply {
    private Integer id;

    private Integer commentid;

    private Integer commenterid;

    private String content;

    private Date commenttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getCommenterid() {
        return commenterid;
    }

    public void setCommenterid(Integer commenterid) {
        this.commenterid = commenterid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }
}