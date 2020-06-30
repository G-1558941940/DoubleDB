package com.doubledb.demo.service;

import com.doubledb.demo.entity.User;

import java.util.List;

/**
 * UserService
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
public interface UserService {
    List<User> getAll();
}
