package com.zakcorp.linkedlists.singly;

public class LinkedList101<E> {
    Node<E> head;
    class Node<E>{
        Node<E> next;
        E element;
        public Node(E element){
            this.element = element;
            next = null;
        }
    }
    
    public void add(E element) {
        addLast(element);
    }

    public void addLast(E element) {
        if(head == null){
            head = new Node<>(element);
            return;
        }
        Node<E> p = head;
        while(p.next != null){
            p = p.next;
        }
        Node<E> t = new Node<>(element);
        t.next = null;
        p.next = t;
    }

    public void print() {
        if(head == null) {
            System.out.println("List is empty....");
        }
        Node<E> p = head;
        while(p != null){
            System.out.print(p.element + " ");
            p = p.next;
        }
        System.out.println();
    }

    public void printCustom(Node<E> p) {
        while(p != null){
            System.out.print(p.element + " ");
            p = p.next;
        }
    }

    public void removeDuplicates(){
        Node<E> p = head;
        Node<E> q = head.next;
        while(q != null){
            if(p.element != q.element) {
                p = q;
                q = q.next;
            } else {
                p.next = q.next;
                q = p.next;
            }
        }
    }


}
