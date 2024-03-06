package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.UserPostMapper;

import java.util.List;

public interface UserPostMapperMapper {
    UserPostMapper selectByPid(Integer pid);

    List<UserPostMapper> selectByUid(Integer uid);

    Integer insert(UserPostMapper userPostMapper);

    Integer deleteByPid(Integer pid);
}
