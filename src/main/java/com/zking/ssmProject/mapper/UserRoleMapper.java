package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}