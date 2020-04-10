package com.abenamor.dsandalgop1.section5.implementation.stack;

import java.util.Stack;
import java.util.StringJoiner;

/**
 * @author abenamor on 10/04/2020
 */
public class QueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    /**
     * O(1)
     * @param item
     * @return
     */
    public Integer enqueue(Integer item) {
        stack1.push(item);
        return item;
    }

    /**
     *
     * @return
     */
    public Integer dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", QueueWithTwoStacks.class.getSimpleName() + "[", "]")
                .add("stack1=" + stack1)
                .add("stack2=" + stack2)
                .toString();
    }
}
