package com.doubledb.demo.service.impl;

import com.doubledb.demo.entity.User;
import com.doubledb.demo.mapper.master.UserMapper;
import com.doubledb.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public List<User> getAll() {
        return userMapper.findAll();
    }
}

