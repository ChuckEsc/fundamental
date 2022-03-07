package com.zh.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author: yunfeng
 * @date: 2022/3/7 11:33 AM
 */

public class ArchivesEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;
    private String msg;


    public ArchivesEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
