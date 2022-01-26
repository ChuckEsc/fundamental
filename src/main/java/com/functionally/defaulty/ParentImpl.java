package com.functionally.defaulty;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ParentImpl implements Parent {

    List<String> messageList = new ArrayList<>();

    @Override
    public void message(String body) {
        messageList.add(body);
    }

    @Override
    public String getLastMessage() {
        return messageList.get(messageList.size() - 1);
    }
}


class ImplExecute {
    public static void main(String[] args) {
        Parent parent = new ParentImpl();
        parent.welcome();
        Assert.assertEquals("", "Parent: hi", parent.getLastMessage());
    }
}