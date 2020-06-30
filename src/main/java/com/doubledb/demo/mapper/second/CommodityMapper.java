package com.doubledb.demo.mapper.second;

import com.doubledb.demo.entity.Commodity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommodityMapper {
    @Select("select id, name, price, user_id as userId, create_time as createTime from `spring-data-jpa`.commodity")
    List<Commodity> findAll();
}