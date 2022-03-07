package com.zh.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: yunfeng
 * @date: 2022/3/7 11:39 AM
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        ArchivesPublisher publisher = context.getBean(ArchivesPublisher.class);
        publisher.publish("hello, application event");
        context.close();
    }
}
