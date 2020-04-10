package com.abenamor.dsandalgop1.section5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @author abenamor on 08/04/2020
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue);
       // reverse(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> integerStack = new Stack<>();
        Integer item;
        while (!queue.isEmpty()){
            item = queue.remove();
            integerStack.push(item);
        }
        while (!integerStack.isEmpty()) {
            queue.add(integerStack.pop());
        }
    }
}
