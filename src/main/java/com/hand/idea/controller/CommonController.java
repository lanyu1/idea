package com.hand.idea.controller;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;


public class CommonController {
    public String outMsg(boolean IsSucceed, String text) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("succeed", IsSucceed);
        map.put("message", text);
        return JSON.toJSONString(map);
    }
}

