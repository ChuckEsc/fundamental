package com.zh.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 扁平数组转树状结构
 */
public class Flat2Tree {

    ArrayList<HashMap<String, Object>> treeList = new ArrayList<>();

    public static void main(String[] args) {
        Flat2Tree flat2Tree = new Flat2Tree();
        flat2Tree.findParent();
    }

    ArrayList<HashMap<String, Object>> findNodes(Integer pid) {
        ArrayList<HashMap<String, Object>> children = new ArrayList<>();
        for (HashMap<String, Object> each : treeList) {
            if ((each.get("parentId") == null ? 0 : each.get("parentId")).equals(pid)) {
                ArrayList<HashMap<String, Object>> tree = findNodes((int) each.get("id"));
                if (tree != null) {
                    each.put("children", tree);
                }
                children.add(each);
            }
        }
        return children.isEmpty() ? null : children;
    }

    void findParent() {
        HashMap<String, Object> map1 = new HashMap<>() {{
            put("title", "广东");
            put("id", 1000);
            put("parentId", null);
        }};
        HashMap<String, Object> map2 = new HashMap<>() {{
            put("title", "深圳");
            put("id", 1001);
            put("parentId", 1000);
        }};
        HashMap<String, Object> map3 = new HashMap<>() {{
            put("title", "福田区");
            put("id", 1002);
            put("parentId", 1001);
        }};
        HashMap<String, Object> map4 = new HashMap<>() {{
            put("title", "翠屏区");
            put("id", 1003);
            put("parentId", 1001);
        }};
        treeList.add(map1);
        treeList.add(map2);
        treeList.add(map3);
        treeList.add(map4);

        for (HashMap<String, Object> item : treeList) {
            ArrayList<HashMap<String, Object>> childrenList = new ArrayList<>();
            if (item.get("parentId") == null) {
                ArrayList<HashMap<String, Object>> children = findNodes((Integer) item.get("id"));
                if(children != null){
                    childrenList.addAll(children);
                    item.put("children", childrenList);
                    System.out.println("item = " + item);
                    item.forEach((key, value) -> {
                                System.out.print("key = " + key);
                                System.out.println(", value = " + value);
                            }
                    );
                }
            }
        }
    }
}
