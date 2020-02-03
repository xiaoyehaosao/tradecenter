package com.xyhs.b2c.tradecenter.feign;

import com.xyhs.b2c.common.tools.api.R;
import com.xyhs.b2c.tradecenter.entity.KfAd;
import com.xyhs.b2c.tradecenter.fallback.IKfAdFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ljp
 * @apiNote
 * @date 17:53 2020/1/3
 **/
@FeignClient(name = "xyhs-tradecenter" ,fallback = IKfAdFallback.class)
public interface IKfAdClient {

    /**
     * 按Id 查询信息
     * @param id id
     * @return 查询结果
     */
    @GetMapping("/kfAd/queryById")
    R<KfAd> queryById(@RequestParam("id")Long id);
}
