package com.zh.algorithms;

import java.util.Stack;


/**
 * 要求：使用两个Stack栈实现队列结构，包括push/pop 操作
 */
public class QueueImplement {


    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        // 不要使用for循环
        if (stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueImplement queue = new QueueImplement();
        queue.push(1);
        queue.push(2);
        System.out.println("queue.pop() = " + queue.pop());
        System.out.println("queue.pop() = " + queue.pop());
    }
}
