package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Role;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}