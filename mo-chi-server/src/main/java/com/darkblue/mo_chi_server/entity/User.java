package com.darkblue.mo_chi_server.entity;

import com.darkblue.mo_chi_server.entity.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer uid;
    private String userName;
    private String password;
    private Gender sex;
    private String email;
    private Date createdDatetime;
    private String motto;
    private Integer point;
}
