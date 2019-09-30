package com.zakcorp.stack;

public class ArrayStack<E> implements StackI<E> {
    private final static int DEFAULT_SIZE = 10;
    private int top;
    private E[] elements;
    public ArrayStack(){
        this(DEFAULT_SIZE);
        top = -1;
    }
    public ArrayStack(int initSize){
        elements = (E[])new Object[initSize];
        top = -1;
    }
    @Override
    public void push(E element) {
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        elements[++top] = element;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            return null;
        }
        return elements[top--];
    }

    @Override
    public E peek(int index) {
        if(isEmpty()){
            return null;
        }
        return null;
    }

    @Override
    public E peek() {
        if(isEmpty()){
            return null;
        }
        return elements[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == getSize() - 1;
    }

    @Override
    public int getSize() {
        return top + 1;
    }

    @Override
    public int search(E element) {
        return 0;
    }

    @Override
    public void print() {
        for(int i = top; i >= 0; i--){
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
