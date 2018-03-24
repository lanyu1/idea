package com.hand.idea.domain;

public class Great {
    private Integer id;

    private Integer eventid;

    private Integer userid;

    public Great() {
    }

    public Great(Integer eventid, Integer userid) {
        this.eventid = eventid;
        this.userid = userid;
    }

    public Great(Integer id, Integer eventid, Integer userid) {
        this.id = id;
        this.eventid = eventid;
        this.userid = userid;
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}