package com.hand.idea.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
/**
 * 创意表
 * @author admin
 *
 */
public class Event {
    private Integer id;

    private Integer founderid;

    private String title;

    private Integer type;

    private String photoname;

    private String province;

    private String city;

    private String detaileddescription;

    private Date createtime;

    private Integer stateid;

    private String instruction;

    private Integer support;

    private User user;

    private EventType eventType;

    public Event() {

    }

    public Event(Integer founderid, String title, Integer type, String photoname, String province, String city, String detaileddescription, Date createtime, Integer stateid, String instruction, Integer support, User user, EventType eventType) {
        this.founderid = founderid;
        this.title = title;
        this.type = type;
        this.photoname = photoname;
        this.province = province;
        this.city = city;
        this.detaileddescription = detaileddescription;
        this.createtime = createtime;
        this.stateid = stateid;
        this.instruction = instruction;
        this.support = support;
        this.user = user;
        this.eventType = eventType;
    }

    public Event(Integer founderid, String title, Integer type, String photoname, String province, String city, Date createtime, String instruction) {
        this.founderid = founderid;
        this.title = title;
        this.type = type;
        this.photoname = photoname;
        this.province = province;
        this.city = city;
        this.createtime = createtime;
        this.instruction = instruction;
    }

    public Event(Integer id, Integer founderid, String title, Integer type, String photoname, String province, String city, String detaileddescription, Date createtime, Integer stateid, String instruction, Integer support) {
        this.id = id;
        this.founderid = founderid;
        this.title = title;
        this.type = type;
        this.photoname = photoname;
        this.province = province;
        this.city = city;
        this.detaileddescription = detaileddescription;
        this.createtime = createtime;
        this.stateid = stateid;
        this.instruction = instruction;
        this.support = support;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname == null ? null : photoname.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDetaileddescription() {
        return detaileddescription;
    }

    public void setDetaileddescription(String detaileddescription) {
        this.detaileddescription = detaileddescription == null ? null : detaileddescription.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }
}