package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Notice;

public interface NoticeMapper {
    int deleteByPrimaryKey(String notid);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(String notid);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}