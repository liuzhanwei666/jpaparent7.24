package com.lzw.service.impl;

import com.lzw.entity.MyPageImpl;
import com.lzw.entity.User;
import com.lzw.entity.UserVo;
import com.lzw.repository.UserRepository;
import com.lzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public MyPageImpl<User> list(UserVo userVo) {
        //分页的对象
        Pageable pageable = PageRequest.of(userVo.getPageNum()-1, userVo.getPageSize(), Sort.Direction.DESC, "uid");
        Page<User> page = userRepository.findAll(pageable);
        return new MyPageImpl<>(page);
    }
}
