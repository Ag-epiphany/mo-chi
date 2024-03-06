package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.PostCommentMapper;

import java.util.List;

public interface PostCommentMapperMapper {
    PostCommentMapper selectByCid(Integer cid);

    List<PostCommentMapper> selectByPid(Integer pid);

    Integer insert(PostCommentMapper postCommentMapper);

    Integer deleteByCid(Integer cid);
}
