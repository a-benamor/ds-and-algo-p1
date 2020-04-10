package com.abenamor.dsandalgop1.section5.twoqueue;

/**
 * @author abenamor on 10/04/2020
 */
public class StackWithTwoQueueDemo {

    public static void main(String[] args) {
        StackWithTwoQueue stackWithTwoQueue = new StackWithTwoQueue();
        stackWithTwoQueue.push(10);
        stackWithTwoQueue.push(20);
        stackWithTwoQueue.push(30);
        System.out.println(stackWithTwoQueue.toString());

        System.out.println("pop: " + stackWithTwoQueue.pop());
        System.out.println("pop: " + stackWithTwoQueue.pop());
        System.out.println(stackWithTwoQueue.toString());

        stackWithTwoQueue.push(40);
        System.out.println(stackWithTwoQueue.toString());

        System.out.println("pop: " + stackWithTwoQueue.pop());
        System.out.println(stackWithTwoQueue.toString());
    }
}
