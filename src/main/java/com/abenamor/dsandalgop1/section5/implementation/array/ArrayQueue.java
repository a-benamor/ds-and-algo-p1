package com.abenamor.dsandalgop1.section5.implementation.array;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author abenamor on 08/04/2020
 */
public class ArrayQueue {
    private int[] items ;
    private int top = 0;

    public ArrayQueue(int size) {
        items = new int[size];
    }

    public int enqueue(int element) {
        if(top > (items.length - 1) ) {
            throw new IllegalStateException("the queue is full");
        }
        items[top] = element;
        top ++;
        return element;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("The queue is already empty");
        }
        int result = items[0];
        for (int i=0; i< items.length -1; i++ ) {
            items[i] = items[i+1];
        }
        top --;
        return result;
    }

    public boolean isEmpty() {
        return items.length == 0;
    }
    public boolean isFull() {
        return top > items.length-1;
    }

    @Override
    public String toString() {
        int[] itemsToPrint = Arrays.copyOfRange(items,0, top);
        return new StringJoiner(", ", ArrayQueue.class.getSimpleName() + "[", "]")
                .add("items=" + Arrays.toString(itemsToPrint))
                .add("top=" + top)
                .toString();
    }
}
