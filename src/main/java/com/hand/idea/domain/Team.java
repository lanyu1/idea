package com.hand.idea.domain;
/**
 * 小组实体类
 */
import java.util.Date;

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
}