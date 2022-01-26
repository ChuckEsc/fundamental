package com.functionally.defaulty;

public interface Parent {
    public void message(String body);

    public default void welcome(){
        message("Parent: hi");
    }

    public String getLastMessage();
}

interface Child extends Parent{
    @Override
    default void welcome() {
        message("Child: hi");
    }
}