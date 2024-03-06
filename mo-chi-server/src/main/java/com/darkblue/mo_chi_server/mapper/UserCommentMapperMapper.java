package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.UserCommentMapper;

import java.util.List;

public interface UserCommentMapperMapper {
    UserCommentMapper selectByCid(Integer cid);

    List<UserCommentMapper> selectByUid(Integer uid);

    Integer insert(UserCommentMapper userCommentMapper);

    Integer deleteByCid(Integer cid);
}
