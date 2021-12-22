package com.zakcorp.generaltest;

import java.util.Arrays;


public class CircularDriver {
    static class MyCircularQueue {
        int[] queueArr;
        private int head;
        private int tail;
        private final int size;
        public MyCircularQueue(int k) {
            queueArr = new int[k];
            Arrays.fill(queueArr, -1);
            head = -1;
            tail = -1;
            size = k;
        }

        public boolean enQueue(int value) {
            if( !isFull() ) {
                queueArr[++tail] = value;
                return true;
            }
            return false;
        }

        public boolean deQueue() {
            if( !isEmpty() ) {
                queueArr[++head] = -1;
                return true;
            }
            return false;
        }

        public int Front() {
            return queueArr[head];
        }

        public int Rear() {
            return queueArr[tail];
        }

        public boolean isEmpty() {
            return head == size - 1;
        }

        public boolean isFull() {
            if(head == 0) {
                tail = -1;
            }
            return tail == size - 1;
        }
    }


    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println( myCircularQueue.enQueue(1) );
        System.out.println( myCircularQueue.enQueue(2) );
        System.out.println( myCircularQueue.enQueue(3) );
        System.out.println( myCircularQueue.enQueue(4) );
        System.out.println( myCircularQueue.Rear() );
        System.out.println( myCircularQueue.isFull() );
        System.out.println( myCircularQueue.deQueue() );
        System.out.println( myCircularQueue.enQueue(4) );
        System.out.println( myCircularQueue.Rear() );
    }

}
