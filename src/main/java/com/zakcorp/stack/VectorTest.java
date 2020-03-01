package com.zakcorp.stack;

import java.util.*;

public class VectorTest extends Thread{
    Vector<Integer> vector = new Vector<>();
    public void run(){
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
    }
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.start();
        t2.start();
    }
}
