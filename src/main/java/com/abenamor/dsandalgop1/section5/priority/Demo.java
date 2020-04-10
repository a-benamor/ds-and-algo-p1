package com.abenamor.dsandalgop1.section5.priority;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author abenamor on 08/04/2020
 */
public class Demo {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(20);
        priorityQueue.add(1);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}
