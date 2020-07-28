package com.zakcorp.linkedlists.circular;

import java.util.Date;
import java.util.List;

public class CircularSLLImpl {
    Node head;
    Node tail;
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    public void add(int data){
        addLast(data);
    }
    public void add(int index, int data) {
        if(index == 0) {
            addLast(data);
            return;
        }
        Node t = new Node(data);
        Node p = head;
        for(int i = 0; i < index - 1; i++) {
            p = p.next;
        }
        t.next = p.next;
        p.next = t;
    }
    private void addLast(int data) {
        Node t = new Node(data);
        if(head == null) {
            head = t;
        } else {
            tail.next = t;
        }
        tail = t;
        tail.next = head;
    }

    public boolean contains(int value) {
        if(head == null) {
            return false;
        }
        Node p = head;
        do {
            if(p.data == value) {
                return true;
            }
            p = p.next;
        }while(p != head);
        return false;
    }

    public void remove(int data) {

    }

    public void printList(Node head) {
        Node p = head;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        }while(p != head);
        System.out.println();
    }

    public void printList() {
        printList(this.head);
    }

    public int countNodes() {
        int length = 0;
        if(head == null) {
            return length;
        }
        Node p = head;
        do {
            p = p.next;
            length++;
        }while (p != head);
        return length;
    }
}
