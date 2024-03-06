package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.CommentReplyMapper;

import java.util.List;

public interface CommentReplyMapperMapper {
    CommentReplyMapper selectByRid(Integer rid);

    List<CommentReplyMapper> selectByCid(Integer cid);

    Integer insert(CommentReplyMapper commentReplyMapper);

    Integer deleteByRid(Integer rid);
}
