package com.doubledb.demo.mapper.master;

import com.doubledb.demo.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select id, `name`, `password`, phone, address from user")
    List<User> findAll();
}