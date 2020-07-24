package com.lzw.service;

import com.lzw.entity.MyPageImpl;
import com.lzw.entity.UserVo;

public interface UserService {

    MyPageImpl list(UserVo userVo);
}