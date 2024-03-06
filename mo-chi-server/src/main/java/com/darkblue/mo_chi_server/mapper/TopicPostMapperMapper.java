package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.TopicPostMapper;

import java.util.List;

public interface TopicPostMapperMapper {
    TopicPostMapper selectByPid(Integer pid);

    List<TopicPostMapper> selectByTid(Integer tid);

    Integer insert(TopicPostMapper topicPostMapper);

    Integer deleteByPid(Integer pid);
}
