package com.itheima.springboot_01_ssm_startquick.domain;

import lombok.Data;

import java.util.Date;

@Data
public class AyProduct {
    private Integer id;
    private String productImg;
    private String name;
    private Integer number;
    private Date startTime;
    private Date endTime;
    private Date createTime;

}
