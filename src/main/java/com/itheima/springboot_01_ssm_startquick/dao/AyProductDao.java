package com.itheima.springboot_01_ssm_startquick.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.itheima.springboot_01_ssm_startquick.domain.AyProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AyProductDao extends BaseMapper<AyProduct> {

    @Select("select * from ay_product")
    public List<AyProduct> findAll();

    @Select("select * from ay_prodict where productId = #{productId} and userId = #{userId}")
    public AyProduct findId(Integer productId ,Integer userId);
}
