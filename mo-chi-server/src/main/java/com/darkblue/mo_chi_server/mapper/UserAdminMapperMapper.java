package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.UserAdminMapper;

import java.util.List;

public interface UserAdminMapperMapper {
    UserAdminMapper selectByUid(Integer uid);

    UserAdminMapper selectByAid(Integer aid);

    Integer insert(UserAdminMapper userAdminMapper);

    Integer deleteByUid(Integer uid);
}
