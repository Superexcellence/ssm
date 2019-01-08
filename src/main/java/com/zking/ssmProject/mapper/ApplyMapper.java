package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Apply;

public interface ApplyMapper {
    int deleteByPrimaryKey(Integer appid);

    int insert(Apply record);

    int insertSelective(Apply record);

    Apply selectByPrimaryKey(Integer appid);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);
}