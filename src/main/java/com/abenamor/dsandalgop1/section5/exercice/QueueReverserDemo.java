package com.abenamor.dsandalgop1.section5.exercice;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author abenamor on 09/04/2020
 */
public class QueueReverserDemo {
    public static void main(String[] args) {
        QueueReverser queueReverser = new QueueReverser();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue);
        queueReverser.reverse(queue,3);
        System.out.println(queue);
    }
}
