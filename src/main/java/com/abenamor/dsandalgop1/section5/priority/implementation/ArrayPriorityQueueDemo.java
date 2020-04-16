package com.abenamor.dsandalgop1.section5.priority.implementation;

/**
 * @author abenamor on 09/04/2020
 */
public class ArrayPriorityQueueDemo {
    public static void main(String[] args) {
        ArrayPriorityQueue priorityQueue = new ArrayPriorityQueue(6);
        priorityQueue.enqueue(10);
        priorityQueue.enqueue(4);
        priorityQueue.enqueue(12);
        priorityQueue.enqueue(8);
        System.out.println(priorityQueue.toString());
        priorityQueue.enqueue(9);
        System.out.println(priorityQueue.toString());

        System.out.println("dequeue: " + priorityQueue.dequeue());
        System.out.println("dequeue: " + priorityQueue.dequeue());
        System.out.println(priorityQueue.toString());
    }
}
