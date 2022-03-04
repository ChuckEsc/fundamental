package com.zh.jason;

import cn.hutool.json.JSONObject;
import io.reactivex.rxjava3.core.Maybe;

import java.util.HashMap;

/**
 * @author: yunfeng
 * @date: 2022/3/3 10:16 PM
 */

public class Json2Map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "URL");
        JSONObject jsonObject = new JSONObject();
        jsonObject.putAll(map);
        String str = jsonObject.toString();
        String jsonStr = jsonObject.toJSONString(4);
        System.out.println(str);
        System.out.println(jsonStr);

        JSONObject another = new JSONObject(jsonStr);
        System.out.println("another = " + another);
        HashMap<String, String> one = new HashMap<>(4);
        another.forEach((key, value) -> one.put(key, value.toString()));
        System.out.println("one = " + one);
    }
}
