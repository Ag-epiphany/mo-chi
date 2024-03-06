package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.AdminRoleMapper;

import java.util.List;

public interface AdminRoleMapperMapper {
    AdminRoleMapper selectById(Integer id);

    List<AdminRoleMapper> selectAll();

    List<AdminRoleMapper> selectByAid(Integer aid);

    List<AdminRoleMapper> selectByRid(Integer aid);

    Integer insert(AdminRoleMapper adminRoleMapper);

    Integer deleteById(Integer id);
}
