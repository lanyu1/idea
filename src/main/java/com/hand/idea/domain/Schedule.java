package com.hand.idea.domain;

import java.util.Date;
/**
 * 计划日常实体类
 * @author admin
 *
 */
public class Schedule {
    private Integer id;

    private Integer teamid;

    private String content;

    private Date createtime;

    private Date worktime;

    private Boolean issendemail;

    private Boolean issend;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    public Boolean getIssendemail() {
        return issendemail;
    }

    public void setIssendemail(Boolean issendemail) {
        this.issendemail = issendemail;
    }

    public Boolean getIssend() {
        return issend;
    }

    public void setIssend(Boolean issend) {
        this.issend = issend;
    }
}