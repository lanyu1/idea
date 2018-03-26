package com.hand.idea.domain;
/**
 * 小组实体类
 */
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class Team {
    private Integer id;

    private Integer founderid;

    private Integer eventid;

    private String teamname;

    private Integer teammatenumber;

    private Integer maxteammatenumber;

    private String notice;

    private Date createtime;

    private String photoname;

    private String description;

    private List<Teammate> teammates;

    private List<Question> questions;

    private List<Schedule> schedules;

    public Team() {
    }

    public Team(Integer id, Integer founderid, Integer eventid, String teamname, Integer teammatenumber, Integer maxteammatenumber, String notice, Date createtime, String photoname, String description, List<Teammate> teammates, List<Question> questions, List<Schedule> schedules) {
        this.id = id;
        this.founderid = founderid;
        this.eventid = eventid;
        this.teamname = teamname;
        this.teammatenumber = teammatenumber;
        this.maxteammatenumber = maxteammatenumber;
        this.notice = notice;
        this.createtime = createtime;
        this.photoname = photoname;
        this.description = description;
        this.teammates = teammates;
        this.questions = questions;
        this.schedules = schedules;
    }

    public Team(Integer founderid, Integer eventid, String teamname, Integer teammatenumber, Integer maxteammatenumber, String notice, Date createtime, String photoname, String description) {
        this.founderid = founderid;
        this.eventid = eventid;
        this.teamname = teamname;
        this.teammatenumber = teammatenumber;
        this.maxteammatenumber = maxteammatenumber;
        this.notice = notice;
        this.createtime = createtime;
        this.photoname = photoname;
        this.description = description;
    }

    public Team(Integer id, Integer founderid, Integer eventid, String teamname, Integer teammatenumber, Integer maxteammatenumber, String notice, Date createtime, String photoname, String description) {
        this.id = id;
        this.founderid = founderid;
        this.eventid = eventid;
        this.teamname = teamname;
        this.teammatenumber = teammatenumber;
        this.maxteammatenumber = maxteammatenumber;
        this.notice = notice;
        this.createtime = createtime;
        this.photoname = photoname;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFounderid() {
        return founderid;
    }

    public void setFounderid(Integer founderid) {
        this.founderid = founderid;
    }

    public Integer getEventid() {
        return eventid;
    }

    public void setEventid(Integer eventid) {
        this.eventid = eventid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }

    public Integer getTeammatenumber() {
        return teammatenumber;
    }

    public void setTeammatenumber(Integer teammatenumber) {
        this.teammatenumber = teammatenumber;
    }

    public Integer getMaxteammatenumber() {
        return maxteammatenumber;
    }

    public void setMaxteammatenumber(Integer maxteammatenumber) {
        this.maxteammatenumber = maxteammatenumber;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }


    @JsonFormat(pattern="yyyy-MM-dd")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname == null ? null : photoname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public List<Teammate> getTeammates() {
        return teammates;
    }

    public void setTeammates(List<Teammate> teammates) {
        this.teammates = teammates;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }
}