package com.abenamor.dsandalgop1.section4.custom.array;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author abenamor on 06/04/2020
 */
public class CustomStack {
    private int[] items;
    private int top = 0;

    public CustomStack(int size) {
        items = new int[size];
    }

    public int push(int item) {
        if (top >= items.length) {
            int[] newItems = Arrays.copyOf(items, items.length + items.length/2);
            items = newItems;
        }
        items[top] = item;
        top++;
        return item;
    }

    public int pop() {
        if(isEmpty()) {
            throw new IllegalStateException("the stack is empty!");
        }
        int topElement = items[top];
        items[top] = 0;
        top--;
        return topElement;
    }

    public boolean isEmpty() {
        return  (top == 0);
    }

    public int peek() {
        return items[top];
    }

    public int size() {
        return top;
    }

    @Override
    public String toString() {
        int[] itemsUntilTop = Arrays.copyOfRange(items,0, top);
        return new StringJoiner(", ", CustomStack.class.getSimpleName() + "[", "]")
                .add("items=" + Arrays.toString(itemsUntilTop))
                .toString();
    }
}
