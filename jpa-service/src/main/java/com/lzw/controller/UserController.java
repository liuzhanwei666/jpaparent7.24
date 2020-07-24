package com.lzw.controller;

import com.lzw.entity.MyPageImpl;
import com.lzw.entity.User;
import com.lzw.entity.UserVo;
import com.lzw.repository.UserRepository;
import com.lzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public String test(){

        return "test";
    }

    @RequestMapping("testadd")
    public  String testAdd(){
        User user = new User();
        user.setUsername("mytest");
        userRepository.save(user);
        return "ok";
    }

    @RequestMapping("list")
    public MyPageImpl<User> list(UserVo userVo){
        System.out.print(" 服务提供者  参数是  " + userVo);
        MyPageImpl<User> userPage = userService.list(userVo);
        userPage.getContent().iterator().forEachRemaining(x->{System.out.println("x is " + x);});
        return userPage;
    }
}
