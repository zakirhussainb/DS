package com.zakcorp.queues.impl;

public class LLCircularQueue<E> implements QueueI<E> {
    @Override
    public void enqueue(E x) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
