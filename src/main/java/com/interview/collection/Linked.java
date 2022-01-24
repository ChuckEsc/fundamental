package com.interview.collection;

import java.util.*;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.push(1);
        integers.push(2);
        integers.push(3);
        System.out.println("integers.pop() = " + integers.pop());
        integers.forEach(System.out::println);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
    }
}

class Main{
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1); // synchronized 同步锁
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(0,4); // ArrayList只能单向根据索引插入
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1); // LinkedList 实现了 Deque 接口，双端队列
        linkedList.offer(3); // 添加指定元素作为此列表的尾部（最后一个元素） return add(element);

        TreeMap<String, Object> treeMap = new TreeMap<>();

        System.out.println("arrayList.toArray().toString() = " + Arrays.toString(arrayList.toArray()));
        System.out.println("Arrays.stream(linkedList.toArray()).toArray() = " + Arrays.toString(Arrays.stream(linkedList.toArray()).toArray()));

        final HashSet<Integer> hashset = new HashSet<>();
        hashset.add(1);
        hashset.add(2);
        hashset.add(3);
//        hashset.stream().forEach(System.out::println);
        for (Integer integer : hashset) {
            System.out.println("iterator.next() = " + integer);
        }
        final boolean contains = hashset.contains(4);
    }
}
