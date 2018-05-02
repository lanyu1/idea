package com.hand.idea.service.impl;

import com.hand.idea.domain.Permission;
import com.hand.idea.mapper.PermissionMapper;
import com.hand.idea.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by J·S_Meisu on 2018/4/26.
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> selectPermission(String userId) {
        return permissionMapper.selectPermission(userId);
    }
}
