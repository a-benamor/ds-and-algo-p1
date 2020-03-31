package com.abenamor.dsandalgop1.section3.exercice;

import java.util.StringJoiner;

/**
 * @author abenamor on 31/03/2020
 */
public class CustomLinkedList {
    private Node first;
    private Node last;

    public CustomLinkedList(Node first) {
        this.first = first;
    }

    public CustomLinkedList(Node first, Node last) {
        this.first = first;
        this.last = last;
    }

    public void addFirst(int value) {
        Node firstNode = new Node(value, first);
        first = firstNode;
    }

    public void addLast(int value) {
        Node lastNode = new Node(value);
        last.setNext(lastNode);
        last = lastNode;
    }

    public Node deleteFirst() {
        Node result = first;
        first = first.getNext();
        return result;
    }

    public Node deleteLast() {
        Node beforeLast = null;
        Node tempNode = first;
        while (tempNode.getNext() != null) {
            beforeLast = tempNode;
            tempNode = tempNode.getNext();
        }
        beforeLast.setNext(null);
        last = beforeLast;
        return tempNode;
    }

    public boolean contain(int value) {
        Node tempNode = first;
        while (tempNode.getNext() != null) {
            if (tempNode.getValue() == value) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }

    //
    public void addLastParco(int value) {
        Node lastNode = new Node(value);
        Node tempNode = first;
        Node beforeLast;
        while (tempNode.getNext() != null) {
            beforeLast = tempNode;
            tempNode = tempNode.getNext();
            System.out.println(tempNode);
        }
    }








    // getters and setters
    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomLinkedList.class.getSimpleName() + "[", "]")
                .add("first=" + first)
                .add("last=" + last)
                .toString();
    }
}
