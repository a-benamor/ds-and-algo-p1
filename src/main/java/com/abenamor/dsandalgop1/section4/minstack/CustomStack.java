package com.abenamor.dsandalgop1.section4.minstack;

import java.util.*;

/**
 * @author abenamor on 07/04/2020
 */
public class CustomStack {
    private LinkedList<Integer> items = new LinkedList<>();

    public CustomStack() {
    }

    public Integer push(Integer item) {
        items.addFirst(item);
        return item;
    }

    public Integer pop() {
        return items.removeFirst();
    }

    public Integer min() {
       return Collections.min(items);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomStack.class.getSimpleName() + "[", "]")
                .add("items=" + items)
                .toString();
    }
}
