package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.Enum.Gender;
import com.darkblue.mo_chi_server.entity.User;

import java.util.Date;
import java.util.List;

public interface UserMapper {
    User selectByUid(Integer uid);

    List<User> selectByUserName(String userName);

    User selectByEmail(String eamil);

    List<User> selectByCreatedDatetimeRange(Date start, Date end);

    List<User> selectBySex(Gender sex);

    Integer insert(User user);

    Integer deleteByUid(Integer uid);
}
