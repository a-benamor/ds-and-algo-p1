package com.abenamor.dsandalgop1.section5.priority.implementation;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author abenamor on 09/04/2020
 */
public class ArrayPriorityQueue {
    private int[] items;
    private int count;

    public ArrayPriorityQueue(int capaity) {
        items = new int[capaity];
    }

    public int enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("The queue is already full");
        }
        int j=0;
        while (j<count) {
            if (item <= items[j]) {
                // shift the array one step to the right
                for (int i=count-1; i>=j ; i--) {
                    items[i+1] = items[i];
                }
                items[j] = item;
                break;
            } else {
                j++;
            }
        }
        if (items[count] == 0) {
            items[count] = item;
        }
        count++;
        return item;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("The queue is already empty!");

        int result = items[0];
        // shift the array one step to the left
        for(int i=0; i<count-1; i++) {
            items[i] = items[i+1];
        }
        count--;
        return result;
    }
    public boolean isEmpty() {
        return items.length ==0;
    }
    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        int[] untilCountItems = Arrays.copyOfRange(items,0, count);
        return new StringJoiner(", ", ArrayPriorityQueue.class.getSimpleName() + "[", "]")
                .add("items=" + Arrays.toString(untilCountItems))
                .add("count=" + count)
                .toString();
    }
}
