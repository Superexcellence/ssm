package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Vote;

public interface VoteMapper {
    int deleteByPrimaryKey(Integer voteid);

    int insert(Vote record);

    int insertSelective(Vote record);

    Vote selectByPrimaryKey(Integer voteid);

    int updateByPrimaryKeySelective(Vote record);

    int updateByPrimaryKey(Vote record);
}