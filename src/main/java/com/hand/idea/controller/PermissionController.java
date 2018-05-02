package com.hand.idea.controller;

import com.hand.idea.domain.Permission;
import com.hand.idea.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by J·S_Meisu on 2018/4/26.
 */
@CrossOrigin
@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/getPermission")
    public List<Permission> selectPermission(@RequestParam("userId") String userid){
        List<Permission> listPermission =permissionService.selectPermission(userid);
        return listPermission;
    }
}
