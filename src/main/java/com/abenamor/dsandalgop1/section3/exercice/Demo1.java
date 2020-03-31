package com.abenamor.dsandalgop1.section3.exercice;

/**
 * @author abenamor on 31/03/2020
 */
public class Demo1 {

    public static void main(String[] args) {
        Node third = new Node(30,null);
        Node second = new Node(20,third);
        Node first = new Node(10, second);
        CustomLinkedList customLinkedList = new CustomLinkedList(first, third);
        System.out.println(customLinkedList);
        customLinkedList.addFirst(0);
        System.out.println(customLinkedList);
        customLinkedList.addLast(40);
        System.out.println(customLinkedList);
        customLinkedList.deleteFirst();
        System.out.println(customLinkedList);
        Node lastNodeInList = customLinkedList.deleteLast();
        System.out.println("the node deleted: " + lastNodeInList);
        System.out.println(customLinkedList);
        System.out.println("10 exist ?: " + customLinkedList.contain(10));
        System.out.println("200 exist ?: " + customLinkedList.contain(200));


    }

}
