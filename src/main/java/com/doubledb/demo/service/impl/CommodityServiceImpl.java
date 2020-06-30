package com.doubledb.demo.service.impl;

import com.doubledb.demo.entity.Commodity;
import com.doubledb.demo.mapper.second.CommodityMapper;
import com.doubledb.demo.service.CommodityService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CommodityMapperImpl
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
@Service
public class CommodityServiceImpl implements CommodityService {
    private final CommodityMapper commodityMapper;

    public CommodityServiceImpl(CommodityMapper commodityMapper) {
        this.commodityMapper = commodityMapper;
    }

    @Override
    public List<Commodity> getAll() {
        return commodityMapper.findAll();
    }
}
