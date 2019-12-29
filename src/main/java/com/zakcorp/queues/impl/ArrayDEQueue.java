package com.zakcorp.queues.impl;
/*
Concept of ArrayDEQueue:-
1. Insertion and Deletion happens from both the ends.
* Input Restricted ArrayDEQueue
* Output Restricted ArrayDEQueue
 */
public class ArrayDEQueue<E> implements DEQueueI<E> {
    private static final int DEFAULT_SIZE = 10;
    private E[] elements;
    private int front, rear;
    public ArrayDEQueue(){
        this(DEFAULT_SIZE);
    }
    public ArrayDEQueue(int initSize){
        elements = (E[])new Object[initSize];
        front = -1; rear = -1;
    }

    @Override
    public void insertFirst(E element) {
        if(rear == -1){
            rear = 0;
            elements[rear] = element;
        }
        elements[rear++] = element;
    }

    @Override
    public void insertLast(E element) {

    }

    @Override
    public E deleteFirst() {
        return null;
    }

    @Override
    public E deleteLast() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
