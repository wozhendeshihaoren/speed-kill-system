package com.itheima.springboot_01_ssm_startquick.config;

import com.itheima.springboot_01_ssm_startquick.dao.AyProductDao;
import com.itheima.springboot_01_ssm_startquick.domain.AyProduct;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Collection;

@WebListener
public class RedisConfig implements ServletContextListener {

    @Resource
    private AyProductDao ayProductDao;

    @Resource
    private RedisTemplate redisTemplate;
    private static final  String ALL_PRODUCT = "all_product_list";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Collection<AyProduct> ayProducts = ayProductDao.findAll();
        redisTemplate.opsForList().leftPushAll(ALL_PRODUCT,ayProducts);
    }


}
