package com.abenamor.dsandalgop1.section5.implementation.array;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author abenamor on 08/04/2020
 */
public class ArrayQueueMoshSolution {
    private int[] items;
    private int rear;
    private int front;
    private int count;

    public ArrayQueueMoshSolution(int capacity) {
        items = new int[capacity];
    }

    public int enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is already full");
        }
        items[rear] = item;
        rear = (rear + 1) % items.length ;
        count++;
        return item;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is already empty");
        }
        int result = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return result;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayQueueMoshSolution.class.getSimpleName() + "[", "]")
                .add("items=" + Arrays.toString(items))
                .add("rear=" + rear)
                .add("front=" + front)
                .toString();
    }
}
