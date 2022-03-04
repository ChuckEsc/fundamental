package com.zh.jason;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;

import java.util.*;

/**
 * @author: yunfeng
 * @date: 2022/3/4 4:37 PM
 */

public class Json2List {
    public static void main(String[] args) {
        JSONArray array = new JSONArray();
//        ArrayList<Map<String, String>> list = new ArrayList<>();
        HashMap<String, String> map1 = new HashMap<>(2);
        map1.put("name", "附件12");
        map1.put("URL", "https://kdwekk/com");
        HashMap<String, String> map2 = new HashMap<>(2);
        map2.put("name", "附件32");
        map2.put("URL", "https://plutus.online.coloseo.cn");
        ArrayList<Map<String, String>> list = CollectionUtil.newArrayList(map1, map2);
        array = JSONUtil.parseArray(list);
        System.out.println(array);
        String result = array.toString();
        List<HashMap> maps = JSONUtil.toList(result, HashMap.class);
        System.out.println("maps = " + maps);
    }
}
