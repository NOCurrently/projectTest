package com.datasource.controller;

/**
 * @Author xiaochao18
 * @Description TODO
 * @Date $ $
 * @Param $
 * @return $
 **/
import com.datasource.until.JsonUtil;
import com.jd.deliveryTransition.api.DeliveryTransitionAssistantContentService;
import com.jd.deliveryTransition.model.DeliveryDynamicFlow;
import com.jd.deliveryTransition.model.TransitionResult;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;
import java.util.Map;

@DubboService
public class Hlll implements DeliveryTransitionAssistantContentService {
    @Override
    public TransitionResult getAllActivityInfo(String s) {
        return null;
    }

    @Override
    public TransitionResult insertContentItem(DeliveryDynamicFlow deliveryDynamicFlow) {
        System.out.println(JsonUtil.write2JsonStr(deliveryDynamicFlow));
        TransitionResult ss= new TransitionResult();
        ss.setSuccess(true);
        ss.setErrorMsg("dsafdsa");
        return ss;
    }

    @Override
    public TransitionResult getContentList(Map<String, Object> map) {
        return null;
    }

    @Override
    public TransitionResult updateContentStatus(Map<String, Object> map) {
        return null;
    }

    @Override
    public TransitionResult getAllTagInfo(Map<String, Object> map) {
        return null;
    }

    @Override
    public TransitionResult getTagNameAndType(List<Long> list) {
        return null;
    }

    @Override
    public TransitionResult getMatchedTagInfo(Map<String, Object> map) {
        return null;
    }

    @Override
    public TransitionResult setSelectionInfo(Map<String, Object> map) {
        return null;
    }

    @Override
    public TransitionResult delSelectionInfo(Map<String, Object> map) {
        return null;
    }

    @Override
    public TransitionResult getSelectionInfo(Map<String, Object> map) {
        return null;
    }
}
