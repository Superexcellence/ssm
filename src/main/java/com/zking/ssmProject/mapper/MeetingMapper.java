package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Meeting;

public interface MeetingMapper {
    int insert(Meeting record);

    int insertSelective(Meeting record);
}