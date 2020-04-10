package com.abenamor.dsandalgop1.section5.implementation.array;

/**
 * @author abenamor on 08/04/2020
 */
public class ArrayQueueMoshDemo {

    public static void main(String[] args) {
        ArrayQueueMoshSolution arrayQueueMoshSolution = new ArrayQueueMoshSolution(5);
        arrayQueueMoshSolution.enqueue(10);
        arrayQueueMoshSolution.enqueue(20);
        arrayQueueMoshSolution.enqueue(30);
        System.out.println(arrayQueueMoshSolution);
        arrayQueueMoshSolution.enqueue(40);
        arrayQueueMoshSolution.enqueue(50);
        System.out.println(arrayQueueMoshSolution);

       System.out.println("dequeue: " + arrayQueueMoshSolution.dequeue());
       System.out.println("dequeue: " + arrayQueueMoshSolution.dequeue());
        System.out.println(arrayQueueMoshSolution);
        arrayQueueMoshSolution.enqueue(60);
        arrayQueueMoshSolution.enqueue(70);
        System.out.println(arrayQueueMoshSolution);
        System.out.println("dequeue: " + arrayQueueMoshSolution.dequeue());
        System.out.println("dequeue: " + arrayQueueMoshSolution.dequeue());
        System.out.println("dequeue: " + arrayQueueMoshSolution.dequeue());
        System.out.println(arrayQueueMoshSolution);
        arrayQueueMoshSolution.enqueue(80);
        arrayQueueMoshSolution.enqueue(90);
        arrayQueueMoshSolution.enqueue(100);
        System.out.println(arrayQueueMoshSolution);
        arrayQueueMoshSolution.enqueue(110);
        System.out.println(arrayQueueMoshSolution);

    }
}
