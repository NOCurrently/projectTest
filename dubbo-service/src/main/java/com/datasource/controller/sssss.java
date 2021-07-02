package com.datasource.controller;

/**
 * @Author xiaochao18
 * @Description TODO
 * @Date $ $
 * @Param $
 * @return $
 **/
import com.datasource.until.JsonUtil;
import com.jd.deliveryTransition.api.DJThemeReadService;
import com.jd.deliveryTransition.api.DeliveryTransitionAssistantContentService;
import com.jd.deliveryTransition.model.DeliveryDynamicFlow;
import com.jd.deliveryTransition.model.TransitionResult;
import com.jd.deliveryTransition.model.theme.args.ThemePoolArgs;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;
import java.util.Map;

@DubboService
public class sssss implements DJThemeReadService {
    @Override
    public TransitionResult checkThemesStatus(Map<String, Object> map) {
        return null;
    }

    @Override
    public TransitionResult queryThemesConfigInfo(Map<String, Object> map) {
        return null;
    }

    @Override
    public TransitionResult queryExtThemeInfo(Map<String, Object> map) {
        return null;
    }

    @Override
    public TransitionResult checkThemePoolsStatus(Map<String, Object> map) {
        return null;
    }

    @Override
    public TransitionResult queryBabelExtThemeInfo(Map<String, Object> map) {
        return null;
    }

    @Override
    public TransitionResult queryExtRuleInPool(ThemePoolArgs themePoolArgs) {
        return null;
    }

    @Override
    public TransitionResult checkValidThemeInPool(Long aLong, List<Long> list, Map<String, Object> map) {
        System.out.println(aLong);
        System.out.println(list);
        System.out.println(map);
        TransitionResult ss= new TransitionResult();
        ss.setSuccess(false);
        ss.setErrorMsg("checkValidThemeInPool");
        return ss;
    }
}
