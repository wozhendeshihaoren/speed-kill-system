package com.itheima.springboot_01_ssm_startquick;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCreateCacheAnnotation
@EnableMethodCache(basePackages = "com.itheima.springboot_01_ssm_startquick")
public class SSMApplication {

    public static void main(String[] args) {
        SpringApplication.run(SSMApplication.class, args);
    }

}
