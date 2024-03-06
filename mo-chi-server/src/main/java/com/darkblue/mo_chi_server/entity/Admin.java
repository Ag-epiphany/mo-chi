package com.darkblue.mo_chi_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private Integer aid;
    private Date createdDatetime;
    private Date validUntil;
    private Integer grantedBy;
    private Integer revokedBy;
}
