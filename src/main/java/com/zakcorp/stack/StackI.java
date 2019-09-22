package com.zakcorp.stack;

public interface StackI<E> {
    void push(E element);
    E pop();
    E peek(int index);
    E peek();
    boolean isEmpty();
    boolean isFull();
    int getSize();
    int search(E element);
    void print();
}
