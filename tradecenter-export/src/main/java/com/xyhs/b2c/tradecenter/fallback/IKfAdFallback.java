package com.xyhs.b2c.tradecenter.fallback;

import com.xyhs.b2c.tradecenter.feign.IKfAdClient;
import com.xyhs.common.enumcode.ResultCode;
import com.xyhs.common.tools.ExecuteResult;

/**
 * @author ljp
 * @apiNote
 * @date 17:57 2020/1/3
 **/
public class IKfAdFallback implements IKfAdClient {

    @Override
    public ExecuteResult queryById(Long id)  {
        return ExecuteResult.faield(ResultCode.FAILURE.getCode(),"未获取到账号信息");
    }
}
