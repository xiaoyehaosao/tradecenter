package com.xyhs.b2c.tradecenter.controller;


import com.xyhs.b2c.common.tools.api.R;
import com.xyhs.b2c.tradecenter.entity.KfAd;
import com.xyhs.b2c.tradecenter.service.IKfAdService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ljp
 * @since 2019-12-30
 */
@RestController
@RequestMapping("/kfAd")
public class KfAdController {


    @Resource
    private IKfAdService iKfAdService;


    @GetMapping("/queryById")
    public R<KfAd> queryById(@RequestParam("id")Long id){
       KfAd result = iKfAdService.getById(id);
       return R.data(result);
    }


}

