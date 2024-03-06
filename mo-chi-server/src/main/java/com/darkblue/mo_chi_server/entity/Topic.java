package com.darkblue.mo_chi_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic {
    private Integer tid;
    private String description;
    private String name;
    private Integer articleCount;
    private Integer inquiryCount;
}
