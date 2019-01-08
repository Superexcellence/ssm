package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Opinion;

public interface OpinionMapper {
    int deleteByPrimaryKey(Integer opid);

    int insert(Opinion record);

    int insertSelective(Opinion record);

    Opinion selectByPrimaryKey(Integer opid);

    int updateByPrimaryKeySelective(Opinion record);

    int updateByPrimaryKey(Opinion record);
}