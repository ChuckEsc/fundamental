package com.zh.standard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yunfeng
 * @description sublist standard
 * @date: 2022/2/23 5:59 PM
 */

public class SubListStd {
    public static void main(String[] args) {
        // Negative example:
        List<String> originList = new ArrayList();
        originList.add("22");
        List subList = originList.subList(0, 1);
        //warn
        originList.add("22");
        // 在这里可能会导致ConcurrentModificationException
    }
}
