package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.Tag;

import java.util.List;

public interface TagMapper {
    Tag selectByTid(Integer tid);

    List<Tag> selectAll();

    Integer insert(Tag tag);

    Integer deleteByTid(Integer tid);
}
