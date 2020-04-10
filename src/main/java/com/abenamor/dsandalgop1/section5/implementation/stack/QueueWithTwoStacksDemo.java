package com.abenamor.dsandalgop1.section5.implementation.stack;

/**
 * @author abenamor on 10/04/2020
 */
public class QueueWithTwoStacksDemo {
    public static void main(String[] args) {
        QueueWithTwoStacks queueWithTwoStacks = new QueueWithTwoStacks();
        queueWithTwoStacks.enqueue(10);
        queueWithTwoStacks.enqueue(20);
        queueWithTwoStacks.enqueue(30);
        System.out.println(queueWithTwoStacks.toString());
        System.out.println("dequeue: " + queueWithTwoStacks.dequeue());
        System.out.println("dequeue: " + queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.toString());
        queueWithTwoStacks.enqueue(40);
        queueWithTwoStacks.enqueue(50);
        System.out.println(queueWithTwoStacks.toString());
        System.out.println("dequeue: " + queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.toString());

    }
}
