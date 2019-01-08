package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Record;

public interface RecordMapper {
    int deleteByPrimaryKey(String recid);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(String recid);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}