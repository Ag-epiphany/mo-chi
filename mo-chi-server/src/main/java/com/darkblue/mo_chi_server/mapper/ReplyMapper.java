package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.Comment;
import com.darkblue.mo_chi_server.entity.Reply;

import java.util.Date;
import java.util.List;

public interface ReplyMapper {
    Reply selectByRid(Integer rid);

    List<Reply> selectAll();

    List<Reply> selectByAscCreatedDatetime();

    List<Reply> selectByDescCreatedDatetime();

    List<Reply> selectByCreatedDatetimeRange(Date start, Date end);

    Integer insert(Reply reply);

    Integer deleteByRid(Integer rid);
}
