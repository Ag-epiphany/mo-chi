package com.darkblue.mo_chi_server.mapper;

import com.darkblue.mo_chi_server.entity.Note;

import java.util.Date;
import java.util.List;

public interface NoteMapper {
    Note selectByNid(Integer nid);

    List<Note> selectByTitle(String title);

    List<Note> selectByCreatedByDatetimeRange(Date start, Date end);

    List<Note> selectByIsPublic(Boolean isPublic);

    List<Note> selectBySelfTags(String[] selfTags);

    Integer insert(Note note);

    Integer deleteByNid(Integer nid);
}
