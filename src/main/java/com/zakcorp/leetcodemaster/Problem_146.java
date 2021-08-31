package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Problem_146 {
    /*static class LRUCache extends LinkedHashMap<Integer, Integer> {
        private int capacity;
        public LRUCache(int capacity) {
            super(capacity, 0.75F, true);
            this.capacity = capacity;
        }

        public int get(int key) {
            return super.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            super.put(key, value);
        }

        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }
    }*/

    static class LRUCache {
        static class DLLNode {
            private int key, val;
            private DLLNode prev, next;
            public DLLNode() {}
            public DLLNode(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }
        private final int cap;
        private final Map<Integer, DLLNode> map;
        private final DLLNode head, tail;
        public LRUCache(int capacity) {
            this.cap = capacity;
            map = new HashMap<>();
            head = new DLLNode();
            tail = new DLLNode();
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if( !map.containsKey(key) )
                return -1;
            DLLNode dllNode = map.get(key);
            unlink(dllNode);
            addFirst(dllNode);
            return dllNode.val;
        }

        /**
         * Considering three cases:
         *  Case 1: Cache is Empty
         *  Case 2: Cache is Full
         *  Case 3: Cache consists of the key already
         */
        public void put(int key, int value) {
            if( cap <= map.size() && !map.containsKey(key) ) {
                removeTail();
            }
            DLLNode dllNode;
            if( map.containsKey(key) ) {
                dllNode = map.get(key);
                dllNode.val = value;
                unlink(dllNode);
            } else {
                dllNode = new DLLNode(key, value);
                map.put(key, dllNode);
            }
            addFirst(dllNode);
        }

        private void addFirst(DLLNode dllNode) {
            DLLNode temp = head.next;
            head.next = dllNode;
            dllNode.next = temp;
            temp.prev = dllNode;
            dllNode.prev = temp;
        }

        private void removeTail() {
            DLLNode temp = tail.prev;
            tail.prev = temp.prev;
            tail.prev.next = tail;
            temp.prev = null;
            temp.next = null;
            map.remove(temp.key);
        }

        private void unlink(DLLNode dllNode) {
            DLLNode temp = dllNode.prev;
            temp.next = dllNode.next;
            dllNode.next.prev = temp;
            dllNode.prev = null;
            dllNode.next = null;
        }
    }
}
