package com.darkblue.mo_chi_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reply {
    private Integer rid;
    private String contentUrl;
    private Date createdDatetime;
}
