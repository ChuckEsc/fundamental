package com.zh.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author: yunfeng
 * @date: 2022/3/7 11:37 AM
 */

@Component
public class ArchivesPublisher {

    // 注入ApplicationContext用来发布事件
    @Autowired
    ApplicationContext applicationContext;

    //使用ApplicationContext的publishEvent方法来发布
    public void publish(String msg) {
        applicationContext.publishEvent(new ArchivesEvent(this, msg));
    }
}
