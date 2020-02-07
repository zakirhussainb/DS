package com.zakcorp.queues.impl;

public interface QueueI<E> {
    void enqueue(E x);
    E dequeue();
    boolean isFull();
    boolean isEmpty();
}
