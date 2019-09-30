package com.zakcorp.queues;

public class CircularQueue<E> implements QueueI<E> {
    private static final int DEFAULT_SIZE = 5;
    private E[] elements;
    private int front;
    private int rear;
    private int SIZE;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int initSize){
        elements = (E[]) new Object[initSize];
        front = -1;
        rear = -1;
        SIZE = elements.length;
    }

    @Override
    public void enqueue(E data) {
        if(isFull()){
            throw new Error("Queue is Full");
        } else {
            if(front == -1){
                front = 0; rear = 0;
            } else if(rear == SIZE - 1 && front != 0){
                rear = 0;
            } else {
                rear++;
            }
            elements[rear] = data;
        }
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new Error("Queue is Empty");
        }
        E data = elements[front];
        if(front == rear){
            front = -1; rear = -1;
        } else if(front == SIZE - 1){
            front = 0;
        } else {
            front++;
        }
        return data;
    }

    @Override
    public boolean isFull() {
        return (front == rear + 1) || (front == 0 && rear == SIZE - 1);
    }

    @Override
    public boolean isEmpty() {
        return front == -1;
    }

    public void print(){
        if(isEmpty()){
            throw new Error("Queue is Empty");
        }
        if(rear >= front){
            for(int i = front; i <= rear; i++)
                System.out.print(elements[i] + " ");
        } else {
            for (int i = front; i < SIZE; i++)
                System.out.print(elements[i] + " ");
            for(int i = 0; i <= rear; i++)
                System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
