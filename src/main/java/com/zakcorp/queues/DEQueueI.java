package com.zakcorp.queues;

public interface DEQueueI<E> {
    void insertFirst(E element);
    void insertLast(E element);
    E deleteFirst();
    E deleteLast();
    boolean isEmpty();
    boolean isFull();
}
