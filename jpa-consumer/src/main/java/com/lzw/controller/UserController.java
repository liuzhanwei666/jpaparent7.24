package com.lzw.controller;

import com.lzw.entity.MyPageImpl;
import com.lzw.entity.User;
import com.lzw.entity.UserVo;
import com.lzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public MyPageImpl<User> list(UserVo userVo){
        System.out.print(" 消费者参数是  " + userVo);
        MyPageImpl<User> page = userService.list(userVo);

        System.out.println ("  消费者 ========== 已经获取数据了。。。。。。。。。。。。");
        page.getContent().iterator().forEachRemaining(x->{System.out.println("消费者  x is " + x);});

        return page;
    }

}
