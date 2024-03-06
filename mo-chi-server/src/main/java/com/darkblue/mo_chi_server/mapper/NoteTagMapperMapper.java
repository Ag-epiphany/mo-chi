package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.NoteTagMapper;

import java.util.List;

public interface NoteTagMapperMapper {
    NoteTagMapper selectById(Integer id);

    List<NoteTagMapper> selectByNid(Integer nid);

    List<NoteTagMapper> selectByTid(Integer tid);

    Integer insert(NoteTagMapper noteTagMapper);

    Integer deleteById(Integer id);
}
