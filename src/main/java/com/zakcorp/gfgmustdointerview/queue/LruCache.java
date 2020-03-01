package com.zakcorp.gfgmustdointerview.queue;

import java.util.*;

public class LruCache {
    private static Deque<Integer> deque;
    private static int cacheSize;
    private static Set<Integer> hSet;
    public LruCache(int size){
        cacheSize = size;
        deque = new LinkedList<>();
        hSet = new HashSet<>();
    }

    public void refer(int key){
        hSet.add(key);

//        if(!hSet.contains(key)){
//            if(cacheSize == deque.size()){
//                int last = deque.removeLast();
//                hSet.remove(last);
//            }
//        } else {
//            Iterator<Integer> iterator = deque.iterator();
//            while(iterator.hasNext()){
//                if(iterator.next() == key){
//                    iterator.remove();
//                    break;
//                }
//            }
//        }
//        deque.push(key);
//        hSet.add(key);
    }

    public void put(int key, int value){
        deque.push(key);

    }

    public int get(int key){
        int x = -1;
        Iterator<Integer> iterator = deque.iterator();
        while(iterator.hasNext()){
            if(iterator.next() == key){
                x =  iterator.next();
            }
        }
        return x;
    }



    public static void main(String[] args) {
        LruCache lruCache = new LruCache(3);
        lruCache.refer(1);
        lruCache.refer(2);
        lruCache.refer(3);
        lruCache.refer(4);
        lruCache.refer(1);
        lruCache.refer(2);
        lruCache.refer(5);
        lruCache.refer(1);
        lruCache.refer(2);
        lruCache.refer(3);
        lruCache.refer(4);
        lruCache.refer(5);
        /*Deque<Integer> deque = new LinkedList<>();
        deque.push(10); // push will push the element in the front of the Queue
        deque.push(20);
        deque.push(30);
        deque.push(40);
        deque.remove(); */// remove will remove the element from the front of the Queue
        for(Integer i : hSet){
            System.out.println(i);
        }
    }
}
