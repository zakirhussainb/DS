package com.zakcorp.linkedlists.doubly;

public class DLinkedList<E> {
    private Node<E> head;
    static class Node<E>{
        Node<E> prev;
        E element;
        Node<E> next;
        Node(E element){
            prev = null;
            this.element = element;
            next = null;
        }
    }
    /* All insertion methods */
    public void add(E element) {
        addLast(element);
    }
    public void addLast(E element){
        if(head == null){
            addAtHead(element);
            return;
        }
        Node<E> t = new Node<>(element);
        t.next = null;
        Node<E> p = head;
        while(p.next != null){
            p = p.next;
        }
        p.next = t;
        t.prev = p;
    }
    public void addAtHead(E element){
        head = new Node<>(element);
        head.prev = null;
        head.next = null;
    }
    public void addFirst(E element){
        Node<E> t = new Node<>(element);
        t.prev = null;
        t.next = head;
        head.prev = t;
        head = t;
    }
    public void add(int index, E element){
        if(head == null){
            addAtHead(element);
        }
        Node<E> t = new Node<>(element);
        Node<E> p = head;
        for(int i = 0; i < index - 1; i++){
            p = p.next;
        }
        t.next = p.next;
        t.prev = p;
        if(p.next != null){
            p.next.prev = t;
        }
        p.next = t;
    }

    /* Empty LinkedList*/
    public void clear(){
        head = null;
    }
    public void print(){
        if(head == null){
            System.out.println("List is empty...");
        }
        Node<E> p = head;
        while(p != null){
            System.out.print(p.element + " ");
            p = p.next;
        }
        System.out.println();
    }




}
