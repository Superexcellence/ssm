package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Sing;

public interface SingMapper {
    int deleteByPrimaryKey(Integer singid);

    int insert(Sing record);

    int insertSelective(Sing record);

    Sing selectByPrimaryKey(Integer singid);

    int updateByPrimaryKeySelective(Sing record);

    int updateByPrimaryKey(Sing record);
}