package com.zakcorp.trees.heap;

public class MinHeap {
    private static final int DEFAULT_SIZE = 10;
    private int[] elements;
    public MinHeap(){
        this(DEFAULT_SIZE);
    }
    public MinHeap(int initSize){
        elements = new int[initSize];
    }

    public int getParent(int i){
        return (i - 1) / 2;
    }

    public void insert(int n){
        int temp;
        int i = n;
        temp = elements[n];
        while(i > 1 && temp > elements[i/2]){
            elements[i] = elements[i/2];
            i = i / 2;
        }
        elements[i] = temp;
    }
}
