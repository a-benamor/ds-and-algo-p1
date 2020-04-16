package com.abenamor.dsandalgop1.section5.implementation.linkedlist;

import java.util.LinkedList;
import java.util.StringJoiner;

/**
 * @author abenamor on 10/04/2020
 */
public class CustomLinkedListQueue {
    private LinkedList<Integer> items = new LinkedList<>();

    /*
    Time complexity = O(1)
     */
    public Integer enqueue(Integer item) {
        items.addLast(item);
        return item;
    }

    /**
     * Time complexity = O(1)
     * @return
     */
    public Integer dequeue() {
        return items.removeFirst();
    }

    /**
     * Time complexity = O(1)
     * @return
     */
    public Integer peek() {
        return items.peek();
    }

    public Integer size() {
        return items.size();
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", CustomLinkedListQueue.class.getSimpleName() + "[", "]")
                .add("items=" + items)
                .toString();
    }
}
