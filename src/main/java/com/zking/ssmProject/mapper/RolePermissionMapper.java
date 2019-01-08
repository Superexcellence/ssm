package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.RolePermission;

public interface RolePermissionMapper {
    int insert(RolePermission record);

    int insertSelective(RolePermission record);
}