package com.hand.idea.service;

import com.hand.idea.domain.Permission;

import java.util.List;

/**
 * Created by J·S_Meisu on 2018/4/26.
 */
public interface PermissionService {
    public List<Permission> selectPermission(String userId);
}

