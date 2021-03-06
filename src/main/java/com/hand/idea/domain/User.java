package com.hand.idea.domain;

import java.util.List;
import java.util.UUID;

/**
 * 用户实体类
 * @author admin
 *
 */
public class User {
    private Integer id;

    private String userId;

    private String userToken;

    private String phone;

    private String email;

    private String password;

    private Integer emailStateId = 0;

    private String nikeName;

    private Integer age;

    private String headPhoto;

    private String area;

    private String specialty;

    private String description;

    private List<Permission> permissions;

    private List<Event> events;

    private List<Hobby> hobbyList;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String email, String password, String nikeName) {
        this.email = email;
        this.password = password;
        this.nikeName = nikeName;
    }

    public User(String phone, String email, String password, Integer emailStateId, String nikeName, Integer age,
                String headPhoto, String area, String specialty, String description, List<Event> events, List<Hobby> hobbyList) {
		super();
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.emailStateId = emailStateId;
		this.nikeName = nikeName;
		this.age = age;
		this.headPhoto = headPhoto;
		this.area = area;
		this.specialty = specialty;
		this.description = description;
		this.events = events;
		this.hobbyList = hobbyList;
	}

    public User(Integer id, String userId, String userToken, String phone, String email, String password, Integer emailStateId, String nikeName, Integer age, String headPhoto, String area, String specialty, String description, List<Permission> permissions, List<Event> events, List<Hobby> hobbyList) {
        this.id = id;
        this.userId = userId;
        this.userToken = userToken;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.emailStateId = emailStateId;
        this.nikeName = nikeName;
        this.age = age;
        this.headPhoto = headPhoto;
        this.area = area;
        this.specialty = specialty;
        this.description = description;
        this.permissions = permissions;
        this.events = events;
        this.hobbyList = hobbyList;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Hobby> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<Hobby> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public User() {
		super();
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getEmailStateId() {
        return emailStateId;
    }

    public void setEmailStateId(Integer emailStateId) {
        this.emailStateId = emailStateId;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName == null ? null : nikeName.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto == null ? null : headPhoto.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", emailStateId=" + emailStateId +
                ", nikeName='" + nikeName + '\'' +
                ", age=" + age +
                ", headPhoto='" + headPhoto + '\'' +
                ", area='" + area + '\'' +
                ", specialty='" + specialty + '\'' +
                ", description='" + description + '\'' +
                ", events=" + events +
                ", hobbyList=" + hobbyList +
                '}';
    }
}