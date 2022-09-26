package com.itheima.springboot_01_ssm_startquick.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AyUserKillProduct {

    private Integer id;
    private Integer productId;
    private Integer userId;
    private Integer state;
    private Date createTime;
}
