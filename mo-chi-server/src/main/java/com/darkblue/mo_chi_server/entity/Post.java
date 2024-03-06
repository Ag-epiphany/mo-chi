package com.darkblue.mo_chi_server.entity;

import com.darkblue.mo_chi_server.entity.Enum.PostType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private Integer pid;
    private String title;
    private String contentUrl;
    private Date createdDatetime;
    private Date updatedDatetime;
    private Integer visitedCount;
    private PostType type;
}
