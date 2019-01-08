package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Dict;

public interface DictMapper {
    int insert(Dict record);

    int insertSelective(Dict record);
}