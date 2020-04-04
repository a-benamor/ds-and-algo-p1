package com.abenamor.dsandalgop1.section3.exercice;

/**
 * @author abenamor on 03/04/2020
 */
public class DemoNode {

    public static void main(String[] args) {
        Node third = new Node(30);
        Node second = new Node(20, third);
        Node first = new Node(10, second);

        System.out.println("Second: " + second);
        Node other = first.getNext();
        System.out.println("other equal second ?: " + other.equals(second));
        boolean isEqual = (other == second);
        System.out.println("other == second ?: " + isEqual);

        other.setValue(50000);
        System.out.println("-------- Modify other and not second");
        System.out.println("Second: " + second);
    }
}
