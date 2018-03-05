package com.hand.idea.domain;

public class Hobby {
    private Integer hid;

    private Integer userid;

    private String hobbycontent;

    public Hobby() {
    }

    public Hobby(Integer hid, Integer userid, String hobbycontent) {
        this.hid = hid;
        this.userid = userid;
        this.hobbycontent = hobbycontent;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getHobbycontent() {
        return hobbycontent;
    }

    public void setHobbycontent(String hobbycontent) {
        this.hobbycontent = hobbycontent == null ? null : hobbycontent.trim();
    }
}