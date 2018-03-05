package com.hand.idea.domain;
/**
 * 组员实体类
 * @author admin
 *
 */
public class Teammate {
    private Integer id;

    private Integer teammateid;

    private Integer authority;

    private String duty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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