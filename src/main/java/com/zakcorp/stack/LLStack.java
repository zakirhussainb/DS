package com.zakcorp.stack;

public class LLStack<E> implements StackI<E> {
    private Node<E> head;
    private int size = -1;
    static class Node<E>{
        Node<E> next;
        E element;
        Node(E element){
            this.element = element;
            next = null;
        }
    }

    @Override
    public void push(E element) {
        // Push at the front]
        Node<E> t = new Node<>(element);
        if(t == null){
            throw new StackOverflowError();
        } else {
            t.next = head;
            head = t;
        }
    }

    @Override
    public E pop() {
        if(isEmpty()){
            throw new StackOverflowError();
        }
        Node<E> p = head;
        head = head.next;
        return p.element;
    }

    @Override
    public E peek(int index) {
        if(isEmpty()) {
            throw new StackOverflowError();
        }
        Node<E> p = head;
        for(int i = 0; i < index - 1; i++){
            p = p.next;
        }
        return p.element;
    }

    @Override
    public E peek() {
        if(isEmpty()) {
            throw new StackOverflowError();
        }
        return head.element;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int search(E element) {
        return 0;
    }

    @Override
    public void print() {
        Node<E> p = head;
        while(p != null){
            System.out.print(p.element + " ");
            p = p.next;
        }
        System.out.println();
    }
}
