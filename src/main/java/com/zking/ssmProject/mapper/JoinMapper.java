package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Join;

public interface JoinMapper {
    int insert(Join record);

    int insertSelective(Join record);
}