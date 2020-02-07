package com.zakcorp.queues.integerimpl;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrDequeIntImpl {
    private int front;
    private int rear;
    private int size;
    private int[] arr;
    public ArrDequeIntImpl(int k){
       size = k;
       arr = new int[size];
       front = -1;
       rear = 0;
    }

    public boolean isFull(){
        return (rear == size - 1 && front == 0) || (front == rear + 1);
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean insertFront(int x){
        if(!isFull()){
            if(front == -1){
                front = 0;
                rear = 0;
            } else if(front == 0) {
                front = size - 1;
            } else {
                front = front - 1;
            }
            arr[front] = x;
            return true;
        }
        return false;
    }

    public boolean insertRear(int x){
        if(!isFull()){
            if(front == -1){
                front = 0;
                rear = 0;
            } else if(rear == size - 1){
                rear = 0;
            } else {
                rear++;
            }
            arr[rear] = x;
            return true;
        }
        return false;
    }

    public boolean deleteFront(){
        if(!isEmpty()){
            if(front == rear){
                front = -1;
                rear = -1;
            } else if(front == size - 1){
                front = 0;
            } else {
                front = front + 1;
            }
            return true;
        }
        return false;
    }

    public boolean deleteRear(){
        if(!isEmpty()){
            if(front == rear){
                front = -1;
                rear = -1;
            } else if(rear == 0){
                rear = size - 1;
            } else {
                rear = rear - 1;
            }
            return true;
        }
        return false;
    }

    public int getFront(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public int getRear(){
        if(isEmpty() || rear < 0){
            return -1;
        }
        return arr[rear];
    }

    public static void main(String[] args) {
        ArrDequeIntImpl arrDequeInt = new ArrDequeIntImpl(5);
        arrDequeInt.insertRear(10);
        arrDequeInt.insertRear(20);
        arrDequeInt.insertRear(30);
        arrDequeInt.insertFront(5);
    }


}
