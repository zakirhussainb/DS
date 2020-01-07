package com.zakcorp.stack;

public class ArrayStack<E> implements StackI<E> {
    private int size;
    private int top;
    private E[] elements;
    public ArrayStack(){
        size = 6;
        elements = (E[])new Object[size];
        top = -1;
    }
    public ArrayStack(int initSize){
        this.size = initSize;
        elements = (E[])new Object[this.size];
        top = -1;
    }
    @Override
    public void push(E element) {
        if(isFull()){
            throw new StackOverflowError();
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
        if(isEmpty() || (top - index + 1) < 0){
            System.out.println("Invalid Position...");
            return null;
        }
        return elements[top - index + 1];
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
        return size;
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
