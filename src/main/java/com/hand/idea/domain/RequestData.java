package com.hand.idea.domain;

/**
 * Created by yuLan on 2018/3/25.
 */
public class RequestData {
    private String code = "0000" ;
    private String state = "200" ;
    private String message = "成功" ;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
