package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Proposal;

public interface ProposalMapper {
    int deleteByPrimaryKey(Integer proid);

    int insert(Proposal record);

    int insertSelective(Proposal record);

    Proposal selectByPrimaryKey(Integer proid);

    int updateByPrimaryKeySelective(Proposal record);

    int updateByPrimaryKey(Proposal record);
}