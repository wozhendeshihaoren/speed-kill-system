package com.itheima.springboot_01_ssm_startquick.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.springboot_01_ssm_startquick.domain.AyUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AyUserDao extends BaseMapper<AyUser> {

}
