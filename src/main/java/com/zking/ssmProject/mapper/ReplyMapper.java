package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Reply;

public interface ReplyMapper {
    int deleteByPrimaryKey(Integer repid);

    int insert(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(Integer repid);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);
}