package com.doubledb.demo.controller;

import com.doubledb.demo.entity.Commodity;
import com.doubledb.demo.service.CommodityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
@RestController
@RequestMapping("/commodity")
public class CommodityController {
    private final CommodityService commodityService;

    public CommodityController(CommodityService commodityService) {
        this.commodityService = commodityService;
    }


    @GetMapping("/getAll")
    public List<Commodity> getAll() {
        return commodityService.getAll();
    }
}
