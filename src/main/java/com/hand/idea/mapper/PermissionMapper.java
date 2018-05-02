package com.hand.idea.mapper;

import com.hand.idea.domain.Permission;

import java.util.List;

/**
 * Created by J·S_Meisu on 2018/4/26.
 */
public interface PermissionMapper {

    public List<Permission> selectPermission(String id);
}
