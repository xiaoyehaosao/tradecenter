package com.xyhs.b2c.tradecenter.fallback;

import com.xyhs.b2c.common.tools.api.R;
import com.xyhs.b2c.common.tools.api.ResultCode;
import com.xyhs.b2c.tradecenter.feign.IKfAdClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


/**
 * @author ljp
 * @apiNote
 * @date 17:57 2020/1/3
 **/

@Component
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class IKfAdFallback implements IKfAdClient {

    @Override
    public R queryById(Long id)  {
        return R.fail(ResultCode.FAILURE,"未获取到账号信");
    }
}
