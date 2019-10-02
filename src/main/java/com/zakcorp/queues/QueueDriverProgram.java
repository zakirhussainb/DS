package com.zakcorp.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDriverProgram {
    public static void main(String[] args) {
        /*ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(10);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);
        arrayQueue.print();
        System.out.println("array dequeue result..." + arrayQueue.dequeue());
        arrayQueue.print();*/

       /* CircularQueue<Integer> circularQueue = new CircularQueue<>(6);
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);
        circularQueue.enqueue(60);
        circularQueue.print();
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        circularQueue.print();
        circularQueue.enqueue(70);
        circularQueue.print();*/


        LLQueue<Integer> llQueue = new LLQueue<>();
        llQueue.enqueue(10);
        llQueue.enqueue(20);
        llQueue.enqueue(30);
        llQueue.print();
        llQueue.dequeue();
        llQueue.dequeue();
        llQueue.dequeue();
        llQueue.enqueue(30);
        llQueue.print();

        Deque<Integer> deque = new ArrayDeque<>();
    }
}
