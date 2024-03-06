package com.darkblue.mo_chi_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentReplyMapper {
    private Integer cid;
    private Integer rid;
}
