package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.Enum.PostType;
import com.darkblue.mo_chi_server.entity.Post;

import java.util.Date;
import java.util.List;

public interface PostMapper {
    Post selectByPid(Integer pid);

    List<Post> selectByCreateDatetimeRange(Date start, Date end);

    List<Post> selectByVisitedCountRange(Integer min, Integer max);

    List<Post> selectByType(PostType type);

    Integer insert(Post post);

    Integer deleteByPid(Integer pid);
}
