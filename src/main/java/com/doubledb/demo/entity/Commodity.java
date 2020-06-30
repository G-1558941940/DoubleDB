package com.doubledb.demo.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Commodity {
    private Integer id;

    private String name;

    private String price;

    private Integer userId;

    private Date createTime;
}