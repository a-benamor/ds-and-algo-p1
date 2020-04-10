package com.abenamor.dsandalgop1.section5.implementation.linkedlist;

/**
 * @author abenamor on 10/04/2020
 */
public class Demo {
    public static void main(String[] args) {
        CustomLinkedListQueue customLinkedListQueue = new CustomLinkedListQueue();
        customLinkedListQueue.enqueue(10);
        customLinkedListQueue.enqueue(20);
        customLinkedListQueue.enqueue(30);
        System.out.println("size: " + customLinkedListQueue.size());
        System.out.println(customLinkedListQueue.toString());
        System.out.println("dequeue: " + customLinkedListQueue.dequeue());
        System.out.println(customLinkedListQueue.toString());
        System.out.println("peek: " + customLinkedListQueue.peek());
        System.out.println(customLinkedListQueue.toString());
    }
}
