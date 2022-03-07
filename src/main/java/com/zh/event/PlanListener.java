package com.zh.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author: yunfeng
 * @date: 2022/3/7 11:35 AM
 */

@Component
public class PlanListener implements ApplicationListener<ArchivesEvent> {

    @Override
    public void onApplicationEvent(ArchivesEvent archivesEvent) {
        String msg = archivesEvent.getMsg();
        System.out.println("(Plan Listener)接收到了Archives Publisher发布的消息:" + msg);
    }
}
