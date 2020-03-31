package com.abenamor.dsandalgop1.section3.exercice;

import java.util.StringJoiner;

/**
 * @author abenamor on 31/03/2020
 */
public class Node {
    private int value;
    private Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                .add("value=" + value)
                .add("next=" + next)
                .toString();
    }
}
