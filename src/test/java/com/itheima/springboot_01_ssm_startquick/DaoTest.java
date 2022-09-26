package com.itheima.springboot_01_ssm_startquick;

import com.itheima.springboot_01_ssm_startquick.domain.AyProduct;
import com.itheima.springboot_01_ssm_startquick.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DaoTest {

    @Autowired
    private ProductService productService;
    @Test
    void ProductServiceTest() {
        AyProduct ayProduct = new AyProduct();
        System.out.println(productService.findAll());
    }
}
