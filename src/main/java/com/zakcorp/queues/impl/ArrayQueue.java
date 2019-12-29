package com.zakcorp.queues.impl;

public class ArrayQueue<E> implements QueueI<E>{
    private final static int DEFAULT_SIZE = 5;
    private E[] elements;
    private int front;
    private int rear;
    public ArrayQueue(){
        elements = (E[]) new Object[DEFAULT_SIZE];
        front = 0; rear = 0;
    }
    public ArrayQueue(int initSize){
        elements = (E[]) new Object[initSize];
        front = 0; rear = 0;
    }

    @Override
    public void enqueue(E data) {
        // It takes O(1) time
        if(isFull()) {
            throw new Error("Queue is Full");
        } else {
            elements[rear] = data;
            rear++;
        }
    }

    @Override
    public E dequeue() {
        // It takes O(n) time
        E data = elements[front];
        if(isEmpty()){
            throw new Error("Queue is Empty");
        } else {
            if (rear - 1 >= 0)
                System.arraycopy(elements, 1, elements, 0, rear - 1);
        }
        return data;
    }

    @Override
    public boolean isFull() {
        return rear == elements.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    public void print(){
        if(isEmpty()){
            throw new Error("Queue is Empty");
        }
        for (E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
