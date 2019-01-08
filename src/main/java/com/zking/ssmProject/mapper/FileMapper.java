package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.File;

public interface FileMapper {
    int insert(File record);

    int insertSelective(File record);
}