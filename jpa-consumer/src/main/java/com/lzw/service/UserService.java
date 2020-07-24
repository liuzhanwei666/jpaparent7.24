package com.lzw.service;

import com.lzw.entity.MyPageImpl;
import com.lzw.entity.User;
import com.lzw.entity.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "jpa-service")
public interface UserService {
    @RequestMapping("user/list")
    MyPageImpl<User> list(UserVo userVo);
}
