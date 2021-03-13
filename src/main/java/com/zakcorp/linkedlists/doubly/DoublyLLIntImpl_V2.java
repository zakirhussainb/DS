package com.zakcorp.linkedlists.doubly;

public class DoublyLLIntImpl_V2 {
    public Node head;
    Node tail;
    int size;
    public DoublyLLIntImpl_V2() {
        this.size = 0;
    }
    public static class Node {
        public Node prev;
        public int data;
        public Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public void addLast(int data) {
        if(head == null) {
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        Node t = new Node(data);
        t.prev = tail;
        tail.next = t;
        tail = t;
        size++;
    }
    public void addFirst(int data) {
        if(head == null) {
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        Node t = new Node(data);
        t.next = head;
        head.prev = t;
        head = t;
        size++;
    }
    public void add(int index, int data) {
        if(head == null) {
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        if(index <= 1) {
            addFirst(data);
            return;
        }
        if(index >= size) {
            addLast(data);
            return;
        }
        Node p = head;
        for(int i = 1; i < index - 1; i++) {
            p = p.next;
        }
        Node t = new Node(data);
        t.next = p.next;
        t.prev = p;
        p.next = t;
        t.next.prev = t;
        size++;
    }
    public int deleteFirst() {
        if(head == null) {
            System.out.println("List is Empty..." + size);
            return -1;
        }
        int data = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return data;
    }
    public int deleteLast() {
        if(head == null) {
            System.out.println("List is Empty..." + size);
            return -1;
        }
        int data = tail.data;
        tail.prev.next = null;
        tail = tail.prev;
        size--;
        return data;
    }
    public void deleteMatched(int x) {
        if(head == null) {
            System.out.println("DList is empty..." + size);
        }
        Node p = head;
        while(p != null) {
            if(p.data == x) {
                if(p.prev == null) {
                    head = head.next;
                    head.prev = null;

                }
                if(p.next == null) {
                    p.prev.next = null;
                    size--;
                    break;
                }
                p.next.prev = p.prev;
                size--;
                break;
            }
            p = p.next;
        }
    }
    public int deleteByPos(int index) {
        return 0;
    }
    public void printList() {
        if(head == null) {
            System.out.println("DList is empty..." + size);
            return;
        }
        Node p = head;
        while(p != null) {
            System.out.print(p.data + "<==>");
            p = p.next;
        }
        System.out.print("NULL");
        System.out.println("    Size-> " + size);
    }
    public void printListCustom(Node p) {
        if(p == null) {
            System.out.println("DList is empty..." + size);
            return;
        }
        Node curr = p;
        while(curr != null) {
            System.out.print(curr.data + "<==>");
            curr = curr.next;
        }
        System.out.print("NULL");
        System.out.println("    Size-> " + size);
    }
}
