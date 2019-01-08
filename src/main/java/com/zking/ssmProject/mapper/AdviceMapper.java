package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Advice;

public interface AdviceMapper {
    int deleteByPrimaryKey(String advid);

    int insert(Advice record);

    int insertSelective(Advice record);

    Advice selectByPrimaryKey(String advid);

    int updateByPrimaryKeySelective(Advice record);

    int updateByPrimaryKey(Advice record);
}