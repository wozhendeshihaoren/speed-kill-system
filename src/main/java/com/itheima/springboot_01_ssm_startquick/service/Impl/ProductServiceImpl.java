package com.itheima.springboot_01_ssm_startquick.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.springboot_01_ssm_startquick.dao.AyProductDao;
import com.itheima.springboot_01_ssm_startquick.dao.AyUserKillProductDao;
import com.itheima.springboot_01_ssm_startquick.domain.AyProduct;
import com.itheima.springboot_01_ssm_startquick.domain.AyUserKillProduct;
import com.itheima.springboot_01_ssm_startquick.service.AyUserKillProductService;
import com.itheima.springboot_01_ssm_startquick.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService {

    @Autowired
    private AyProductDao ayProductDao;

    @Autowired
    private RedisTemplate redisTemplate;
    private static final String ALL_PRODUCT = "all_product_list";

    @Autowired
    private AyUserKillProductDao ayUserKillProductDao;
    @Override
    public List<AyProduct> findAll() {
        List<AyProduct> all1 = redisTemplate.opsForList().range(ALL_PRODUCT,0,-1);
        if(all1 !=null && all1.size() > 0){
            return  all1;
        }
        List<AyProduct> all = ayProductDao.findAll();

        return all;
    }

    @Override
    public AyProduct killProduct(Integer id, Integer userId) {
        AyProduct ayProduct = ayProductDao.selectById(id);
        if(ayProduct.getNumber() < 0) {
            return  null;
        }
        ayProduct.setNumber(ayProduct.getNumber() - 1);
        ayProductDao.updateById(ayProduct);
        AyUserKillProduct ayUserKillProduct = new AyUserKillProduct();
        ayUserKillProduct.setProductId(id);
        ayUserKillProduct.setUserId(userId);
        ayUserKillProduct.setCreateTime(new Date());
        ayUserKillProduct.setState(1);
        ayUserKillProductDao.insert(ayUserKillProduct);

        return  ayProduct;
    }
}
