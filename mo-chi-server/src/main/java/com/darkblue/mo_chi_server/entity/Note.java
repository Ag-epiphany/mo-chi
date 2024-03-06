package com.darkblue.mo_chi_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    private Integer nid;
    private String title;
    private String contentUrl;
    private Date createdDatetime;
    private Date updatedDatetime;
    private Boolean isPublic;
    private String selfTags;
}
