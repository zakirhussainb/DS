package com.zakcorp.queues.integerimpl;

public class ArrCircularQueueIntImpl {
    private int size;
    private int front;
    private int rear;
    private int[] arr;
    public ArrCircularQueueIntImpl(int k){
        size = k;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean enQueue(int x){
        if(!isFull()){
            if(front == -1){
                front = 0;
                rear = 0;
            } else if(rear == size - 1 && front != 0){
                rear = 0;
            } else {
                rear++;
            }
            arr[rear] =x;
            return true;
        }
        return false;
    }
    public boolean isFull(){
        return false;
    }
    public boolean deQueue(){
        if(!isEmpty()){
            front++;
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        return false;
    }

    public static void main(String[] args) {
        ArrCircularQueueIntImpl circularQueueInt = new ArrCircularQueueIntImpl(6);
        circularQueueInt.enQueue(10);
        circularQueueInt.enQueue(20);
        circularQueueInt.enQueue(30);
        circularQueueInt.enQueue(40);
        circularQueueInt.enQueue(50);
        circularQueueInt.enQueue(60);
        circularQueueInt.deQueue();

    }
}
