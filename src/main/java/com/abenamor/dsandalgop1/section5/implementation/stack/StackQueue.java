package com.abenamor.dsandalgop1.section5.implementation.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringJoiner;

/**
 * @author abenamor on 08/04/2020
 */
public class StackQueue {
    private Stack<Integer> items = new Stack<>();
    private int count;

    public StackQueue() {
    }

    public Integer enqueue(Integer item) {
        items.push(item);
        count++;
        return item;
    }

    public Integer dequeue() {
        Integer result;
        int j = 0;
        List<Integer> tempList = new ArrayList();
        while (j < (count - 1) ) {
           Integer curElem = items.pop();
           tempList.add(curElem);
           j++;
        }
        result = items.pop();
        for (int k=tempList.size()-1; k>=0; k--) {
            items.push(tempList.get(k));
        }
        count --;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StackQueue.class.getSimpleName() + "[", "]")
                .add("items=" + items)
                .add("count=" + count)
                .toString();
    }
}
