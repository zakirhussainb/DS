package com.zakcorp.queues;

public interface QueueI<E> {
    void enqueue(E x);
    E dequeue();
    boolean isFull();
    boolean isEmpty();


}
