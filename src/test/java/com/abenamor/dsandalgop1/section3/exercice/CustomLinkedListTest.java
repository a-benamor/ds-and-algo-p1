package com.abenamor.dsandalgop1.section3.exercice;

/**
 * @author abenamor on 31/03/2020
 */
public class CustomLinkedListTest {

    public void init() {
        Node third = new Node(30,null);
        Node second = new Node(20,third);
        Node first = new Node(10, second);
        CustomLinkedList customLinkedList = new CustomLinkedList(first, third);
    }


}
