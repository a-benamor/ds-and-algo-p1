package com.abenamor.dsandalgop1.section3.exercice;

import java.util.NoSuchElementException;
import java.util.StringJoiner;

/**
 * @author abenamor on 31/03/2020
 */
public class CustomLinkedList {
    private Node first;
    private Node last;
    private int size =0;

    public CustomLinkedList() {
    }
    public CustomLinkedList(Node first) {
        this.first = first;
    }

    public CustomLinkedList(Node first, Node last) {
        this.first = first;
        this.last = last;
    }

    public void addFirst(int value) {
        Node firstNode = new Node(value);
        // the linked lis is empty
        if (isEmpty()) {
            first = firstNode;
            last = firstNode;
        } else {
            firstNode.setNext(first);
            first = firstNode;
        }
        size++;
    }

    public void addLast(int value) {
        Node lastNode = new Node(value);
        if (isEmpty()) {
            first = lastNode;
            last = lastNode;
        } else {
            last.setNext(lastNode);
            last = lastNode;
        }
        size++;

    }

    public Node removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("The linked list is already empty!");
        }
        if (first == last) {
            first = null;
            last = null;
            size--;
            return null;
        }
        Node result = first;
        first = first.getNext();
        result.setNext(null);
        size--;
        return result;
    }

    public Node removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("The linked list is already empty!");
        }

        if (first == last) {
            first = null;
            last = null;
            size--;
            return null;
        }
        Node beforeLast = null;
        Node tempNode = first;
        while (tempNode.getNext() != null) {
            beforeLast = tempNode;
            tempNode = tempNode.getNext();
        }
        beforeLast.setNext(null);
        last = beforeLast;
        size--;
        return tempNode;
    }

    public void removeLastTutorSol(){
        if(isEmpty())
            throw new NoSuchElementException("The linked list is already empty!");
        if (first == last) {
            first = null;
            last = null;
            return;
        }
        Node previous = getPrevious(last);
        last = previous;
        last.setNext(null);
    }

    private Node getPrevious(Node node) {
        Node tempNode = first;
        while (tempNode != null) {
            if (tempNode.getNext() == node )
                return tempNode;
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public boolean contain(int value) {
        Node tempNode = first;
        while (tempNode != null) {
            if (tempNode.getValue() == value)
                return true;
            tempNode = tempNode.getNext();
        }
        return false;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        Node temp = first;
        while (temp!= null){
            if (temp.getValue() == item)
                return index;
            temp = temp.getNext();
            index ++;
        }
        return -1;
    }

    /* When we work with Data structure, we must always implement effecient methods
    like size method; time complexity = O(1) instead of O(n) if we have done the parse.
     */
    public int size() {
       return size;
    }

    public int[] toArray() {
        if (this.isEmpty())
            return null;
        int[] result = new int[this.size()];
        int index = 0;
        Node tempNode = first;
        while (tempNode != null) {
            result[index] = tempNode.getValue();
            index++;
            tempNode = tempNode.getNext();
        }
        return result;
    }

    public void reverse() {
        Node currItem = first;
        Node  previousItem = null;
        Node nextItem = null;

        while (currItem!= null) {
            nextItem = currItem.getNext();
            currItem.setNext(previousItem);
            previousItem = currItem;
            currItem = nextItem;
        }
        Node temp = first;
        first = last;
        last = temp;

    }

    // under there are a better solution
    public Node getTheKNodeFromTheEnd(int k) {
        // Almost linked list problem can be solved by two pointers

        if (isEmpty()) {
            throw new IllegalStateException();
        }

        if (k > size() || k < 1) {
            throw new IllegalArgumentException("input must be between 1 and the list size");
        }
        Node currentNode = first;
        Node knodeFromCurrent = null;
        while (currentNode!= null){
            knodeFromCurrent = currentNode;
            for (int i=0; i < k; i++) {
                if(knodeFromCurrent != last) {
                    knodeFromCurrent = knodeFromCurrent.getNext();
                } else {
                    return currentNode;
                }
            }
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public int getTheKNodeFromTheEndMoshSolution(int k) {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        Node curNode = first;
        Node kItemFromCurNode = first;
        for(int i=1; i < k ; i++) {
            kItemFromCurNode = kItemFromCurNode.getNext();
            if (kItemFromCurNode == null) {
                throw new IllegalArgumentException("input must be between 1 and the length of the linked list");
            }
        }

        while (kItemFromCurNode != last) {
            kItemFromCurNode = kItemFromCurNode.getNext();
            curNode = curNode.getNext();
        }
        return curNode.getValue();
    }

    public int getMiddleOfTheList() {
        Node firstNode = first;
        Node secondNode = first;

        while (secondNode != last && secondNode.getNext() != last) {
            secondNode = secondNode.getNext().getNext();
            firstNode = firstNode.getNext();
        }

        return firstNode.getValue();
    }

    public boolean isLoopExist() {
        Node firstNode = first;
        Node secondNode = first;
        while (firstNode != last) {
            secondNode = firstNode.getNext();
            while (secondNode != last && secondNode!= null) {
                if (secondNode.getNext() == firstNode)
                    return true;
                 else
                     secondNode = secondNode.getNext();

            }
            if (secondNode!=null && secondNode.getNext() == firstNode) {
                return true;
            }
            firstNode = firstNode.getNext();
        }
        return  false;
    }

    // We will use floyd cycle detection algorithme
    public boolean hasLoop() {
        Node slow = first;
        Node fast = first;

        while (slow != null && slow.getNext() != null) {
            fast = slow.getNext().getNext();
            System.out.println("slow: " + slow.getValue());
            System.out.println("Fast: " + fast.getValue());
            if (fast == slow) {
                return true;
            }
            slow = slow.getNext();
        }
        return false;
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
