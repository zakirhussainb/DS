package com.zakcorp.gfgmustdointerview.queue;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class LruCacheMap {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private Map<Integer, Node> map;
    private int capacity;
    public LruCacheMap(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            Node t = map.get(key);
            t.value = value;


        } else {

        }
    }
    public static void main(String[] args) {

    }
}
