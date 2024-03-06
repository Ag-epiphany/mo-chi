package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.Admin;

import java.util.List;

public interface AdminMapper {
    Admin selectByAid(Integer aid);

    List<Admin> selectAll();

    List<Admin> selectByGrantedBy(Integer aid);

    List<Admin> selectByRevokedBy(Integer aid);

    Integer insert(Admin admin);

    Integer deleteByAid(Integer aid);
}
