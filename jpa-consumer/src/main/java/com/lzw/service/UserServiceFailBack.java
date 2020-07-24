package com.lzw.service;

import com.lzw.entity.MyPageImpl;
import com.lzw.entity.User;
import com.lzw.entity.UserVo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 熔断
 */
@Component
public class UserServiceFailBack implements UserService{

    @Override
    public MyPageImpl<User> list(@RequestBody UserVo userVo) {
        System.out.println(" 对不起，熔断了。。。。");
        return  null;
    }
}
