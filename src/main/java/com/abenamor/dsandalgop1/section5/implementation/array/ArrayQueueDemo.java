package com.abenamor.dsandalgop1.section5.implementation.array;

/**
 * @author abenamor on 08/04/2020
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        System.out.println(arrayQueue);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(40);
        System.out.println("isFull ?: " + arrayQueue.isFull());
        arrayQueue.enqueue(50);
        System.out.println("isFull ?: " + arrayQueue.isFull());
        System.out.println(arrayQueue);
        System.out.println("dequeue: " + arrayQueue.dequeue());
        System.out.println(arrayQueue);
        System.out.println("dequeue: " + arrayQueue.dequeue());
        System.out.println(arrayQueue);
        arrayQueue.enqueue(20);
        System.out.println(arrayQueue);
    }
}
