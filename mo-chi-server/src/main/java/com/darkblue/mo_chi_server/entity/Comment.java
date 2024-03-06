package com.darkblue.mo_chi_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private Integer cid;
    private String contentUrl;
    private Date createdDatetime;
}
