package com.itheima.springboot_01_ssm_startquick.controller;


import com.itheima.springboot_01_ssm_startquick.dao.AyUserKillProductDao;
import com.itheima.springboot_01_ssm_startquick.domain.AyProduct;
import com.itheima.springboot_01_ssm_startquick.service.AyUserKillProductService;
import com.itheima.springboot_01_ssm_startquick.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
     private ProductService productService;

    @Autowired
    private AyUserKillProductService ayUserKillProductService;

    @RequestMapping("findAll")
    public List<AyProduct> findAll(){

        List<AyProduct> products =  productService.findAll();

        return  products;
    }
    @ResponseBody
    @GetMapping("killProduct/{id}/{userId}")
    public  String killProduct(@PathVariable Integer id,@PathVariable Integer userId) {

        AyProduct ayProduct = productService.killProduct(id, userId);
        if(null != ayProduct) {
            return  "success";
        }
        return "fail";
    }


}
