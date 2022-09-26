package com.itheima.springboot_01_ssm_startquick.service;

import com.itheima.springboot_01_ssm_startquick.domain.AyProduct;

import java.util.List;

public interface ProductService {

    public List<AyProduct> findAll();
    public AyProduct killProduct(Integer id,Integer userId);
}
