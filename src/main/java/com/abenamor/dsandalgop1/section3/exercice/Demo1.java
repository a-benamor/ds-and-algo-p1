package com.abenamor.dsandalgop1.section3.exercice;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author abenamor on 31/03/2020
 */
public class Demo1 {

    public static void main(String[] args) {
        Node fifth = new Node(40);
        Node fourth = new Node(50, fifth);
        Node third = new Node(30, fourth);
        Node second = new Node(20, third);
        Node first = new Node(10, second);
        fifth.setNext(third);
        CustomLinkedList customLinkedList = new CustomLinkedList(first, fifth);

        System.out.println("is loop exist with floyd cycle detection: " + customLinkedList.hasLoop());
        System.out.println("is loop exist: " + customLinkedList.isLoopExist());



       /* Node third = new Node(30,null);
        Node second = new Node(20,third);
        Node first = new Node(10, second);
        CustomLinkedList customLinkedList = new CustomLinkedList(first, third);
        System.out.println("Size: " + customLinkedList.getSize());
        System.out.println(customLinkedList);
        customLinkedList.addFirst(0);
        System.out.println(customLinkedList);
        customLinkedList.addLast(40);
        System.out.println(customLinkedList);
        customLinkedList.removeFirst();
        System.out.println(customLinkedList);
        Node lastNodeInList = customLinkedList.removeLast();
        System.out.println("the node deleted: " + lastNodeInList);
        System.out.println(customLinkedList);
        System.out.println("10 exist ?: " + customLinkedList.contain(10));
        System.out.println("200 exist ?: " + customLinkedList.contain(200));
         System.out.println("Size: " + customLinkedList.size());
        customLinkedList.removeLast();
        System.out.println("Size: " + customLinkedList.size());
        customLinkedList.removeFirst();
        System.out.println("Size: " + customLinkedList.size());

        customLinkedList.reverse();
        System.out.println("---------Reversing--------------");
        System.out.println(customLinkedList);
        int[] toArrayReversing = customLinkedList.toArray();
        System.out.println(Arrays.toString(toArrayReversing));

        int[] toArray = customLinkedList.toArray();
        System.out.println(Arrays.toString(toArray));
        */


    }

}
