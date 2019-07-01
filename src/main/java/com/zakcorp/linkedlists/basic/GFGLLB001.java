package com.zakcorp.linkedlists.basic;

/**
 * @author : Zakir
 * Question : Finding middle element in a linked list
 * Result:
 * Execution Time:
 * TODO:
 */
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class GFGLLB001 {
    Node head;
    public void addToTheLast(Node node) {
        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
                temp.next = node;
            }
        }
    }

    public static void main(String[] args) {

    }
}
