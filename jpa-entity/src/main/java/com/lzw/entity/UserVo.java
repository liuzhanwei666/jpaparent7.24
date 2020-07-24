package com.lzw.entity;

import lombok.Data;

@Data
public class UserVo extends  User {
    Integer pageNum=1;
    Integer pageSize=2;

}
