package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.Role;

public interface RoleMapper {
    Role selectByRid(Integer rid);

    Role selectAll();

    Integer insert(Role role);

    Integer deleteByRid(Integer rid);
}
