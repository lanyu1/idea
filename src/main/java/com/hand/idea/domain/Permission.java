package com.hand.idea.domain;

/**
 * Created by J·S_Meisu on 2018/4/25.
 */
public class Permission {
    private Integer pid;

    private String userId;

    private String permission;

    public Permission() {
    }

    public Permission(Integer pid, String userId, String permission) {
        this.pid = pid;
        this.userId = userId;
        this.permission = permission;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
