package com.abenamor.dsandalgop1.section5.twoqueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringJoiner;

/**
 * @author abenamor on 10/04/2020
 */
public class StackWithTwoQueue {
    private Queue<Integer> queue1 = new ArrayDeque<>();
    private Queue<Integer> queue2 = new ArrayDeque<>();

    public Integer push(Integer item) {
        queue1.add(item);
        return item;
    }
    public Integer pop() {
        while (queue1.size()>1) {
            queue2.add(queue1.remove());
        }

        Integer result = queue1.remove();

        Queue<Integer> tempQueue = queue1;
        queue1 = queue2;
        queue2 = tempQueue;

        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StackWithTwoQueue.class.getSimpleName() + "[", "]")
                .add("queue1=" + queue1)
                .add("queue2=" + queue2)
                .toString();
    }
}
