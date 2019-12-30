package com.xyhs.b2c.tradecenter;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xyhs.b2c.tradecenter.entity.KfAd;
import com.xyhs.b2c.tradecenter.service.IKfAdService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author ljp
 * @apiNote
 * @date 15:17 2019/12/30
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Component
@Slf4j
public class IKfAdServiceTest {

    @Resource
    private IKfAdService iKfAdService;


    @Test
    public void findOne(){
        Page<KfAd> page = new Page<>();
        QueryWrapper<KfAd> param = new QueryWrapper<>();
        IPage<KfAd> pageResult =  iKfAdService.page(page,param);
        log.info(JSONObject.toJSONString( pageResult));
    }
}
