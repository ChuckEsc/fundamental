package com.zh.standard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yunfeng
 */
public class EditCollectionLoop {
    public static void main(String[] args) {
//        Negative example:
        List<String> originList = new ArrayList();
        originList.add("22");
        for (String item : originList) {
            //warn 不要在遍历中使用【originList.add】
            originList.add("bb");
        }

//        Positive example:
        ArrayList<Integer> integers = new ArrayList<>();
        Iterator it=integers.iterator();
        while(it.hasNext()){
            Integer temp = (Integer) it.next();
            if (true) {
                it.remove();
            }
        }
    }
}
