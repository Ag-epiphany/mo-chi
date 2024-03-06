package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.Topic;

import java.util.List;

public interface TopicMapper {
    Topic selectByTid(Integer tid);

    Topic selectByName(String name);

    List<Topic> selectByArticleCountRange(Integer min, Integer max);

    List<Topic> selectByInquiryCountRange(Integer min, Integer max);

    Integer insert(Topic topic);

    Integer deleteByTid(Integer tid);
}
