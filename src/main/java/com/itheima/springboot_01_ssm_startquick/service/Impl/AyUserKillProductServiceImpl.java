package com.itheima.springboot_01_ssm_startquick.service.Impl;

import com.itheima.springboot_01_ssm_startquick.dao.AyUserKillProductDao;
import com.itheima.springboot_01_ssm_startquick.domain.AyUserKillProduct;
import com.itheima.springboot_01_ssm_startquick.service.AyUserKillProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AyUserKillProductServiceImpl implements AyUserKillProductService {

    @Autowired
    private AyUserKillProductDao ayUserKillProductDao;
    @Override
    public int save(AyUserKillProduct killProduct) {

        int i = ayUserKillProductDao.updateById(killProduct);
        return i;
    }
}
