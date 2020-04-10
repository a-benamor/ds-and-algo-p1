package com.abenamor.dsandalgop1.section5.exercice;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author abenamor on 09/04/2020
 */
public class QueueReverser {
    public void reverse(Queue<Integer> queue, int k) {

        Stack<Integer> integerStack = new Stack<>();
        for (int i =0; i< k ; i++) {
            integerStack.push(queue.remove());
        }
        List<Integer> tempList = new ArrayList<>();
        while (!queue.isEmpty()) {
            tempList.add(queue.remove());
        }
        while (!integerStack.isEmpty()) {
            queue.add(integerStack.pop());
        }

        for (Integer elem: tempList) {
            queue.add(elem);
        }

    }
}
