package com.abenamor.dsandalgop1.section5.implementation.stack;

/**
 * @author abenamor on 08/04/2020
 */
public class StackQueueDemo {
    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        stackQueue.enqueue(10);
        stackQueue.enqueue(20);
        stackQueue.enqueue(30);
        stackQueue.enqueue(40);
        System.out.println(stackQueue);
        stackQueue.dequeue();
        stackQueue.dequeue();
        System.out.println(stackQueue);
    }
}
