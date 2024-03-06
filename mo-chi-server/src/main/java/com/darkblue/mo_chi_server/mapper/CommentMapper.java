package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.Comment;

import java.util.Date;
import java.util.List;

public interface CommentMapper {
    Comment selectByCid(Integer cid);

    List<Comment> selectAll();

    List<Comment> selectByAscCreatedDatetime();

    List<Comment> selectByDescCreatedDatetime();

    List<Comment> selectByCreatedDatetimeRange(Date start, Date end);

    Integer insert(Comment comment);

    Integer deleteByCid(Integer cid);
}
