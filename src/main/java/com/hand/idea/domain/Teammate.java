package com.hand.idea.domain;
/**
 * 组员实体类
 * @author admin
 *
 */
public class Teammate {
    private Integer tid;

    private Integer teamid;

    private Integer teammateid;

    private Integer authority;

    private String duty;

    public Teammate() {
    }

    public Teammate(Integer tid, Integer teamid, Integer teammateid, Integer authority, String duty) {
        this.tid = tid;
        this.teamid = teamid;
        this.teammateid = teammateid;
        this.authority = authority;
        this.duty = duty;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getTeammateid() {
        return teammateid;
    }

    public void setTeammateid(Integer teammateid) {
        this.teammateid = teammateid;
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }
}