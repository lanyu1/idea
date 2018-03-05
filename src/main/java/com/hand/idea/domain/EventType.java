package com.hand.idea.domain;

public class EventType {
    private Integer etid;

    private String typecontent;

    public Integer getEtid() {
        return etid;
    }

    public void setEtid(Integer etid) {
        this.etid = etid;
    }

    public String getTypecontent() {
        return typecontent;
    }

    public void setTypecontent(String typecontent) {
        this.typecontent = typecontent == null ? null : typecontent.trim();
    }
}