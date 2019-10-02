package com.zakcorp.queues;

public class LLQueue<E> implements QueueI<E> {
    private Node<E> front;
    private Node<E> rear;
    static class Node<E> {
        E element;
        Node<E> next;
        Node(E element){
            this.element = element;
            next = null;
        }
    }

    @Override
    public void enqueue(E data) {
        Node<E> t = new Node<>(data);
        t.next = null;
        if(front == null){
            front = t;
            rear = t;
        } else {
            rear.next = t;
            rear = t;
        }
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new Error("Queue is empty...");
        }
        E data = front.element;
        front = front.next;
        return data;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    public void print(){
        if(isEmpty()){
            throw new Error("Queue is empty...");
        }
        Node<E> p = front;
        while(p != null){
            System.out.print(p.element + " ");
            p = p.next;
        }
        System.out.println();
    }
}
