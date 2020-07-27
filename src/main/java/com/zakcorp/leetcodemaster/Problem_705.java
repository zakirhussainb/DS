package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_705 {
    List<Integer> list;
    public Problem_705() {
        list = new ArrayList<>();
    }
    public void add(int key) {
        if(!contains(key)) {
            list.add(key);
        }
    }
    public void remove(int key) {
        if(list.contains(key)) {
            list.remove((Integer) key);
        }
    }
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return list.contains(key);
    }

    static class Solver1 {
        // Using an arbitary
        Element[] data;
        public Solver1() {
            data = new Element[100000];
        }
        public void add(int key) {
            // If the key is already present then a new object will be created but on a different address, remember the
            // "new" keyword.
            data[key] = new Element(key);
        }
        public void remove(int key) {
            data[key] = null;
        }
        public boolean contains(int key) {
            Element e = data[key];
            if(e == null) {
                return false;
            }
            return e.value == key;
        }
    }
    static class Element {
        int value;
        public Element(int value) {
            this.value = value;
        }
    }
    static class Solver2 {
        // Using HashMap to design a HashSet.
        Map<Integer, Integer> hashMap;
        public Solver2() {
            hashMap = new HashMap<>();
        }
        public void add(int key) {
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, key);
            }
        }
        public void remove(int key) {
            hashMap.remove(key);
        }
        public boolean contains(int key) {
            return hashMap.containsKey(key);
        }
    }
    public static void main(String[] args) {
        /*Problem_705 p = new Problem_705();
        p.add(1);
        p.add(2);
        System.out.println(p.contains(1));
        System.out.println(p.contains(3));
        p.add(2);
        p.contains(2);
        p.remove(2);
        p.contains(2);*/
        Problem_705.Solver1 p1 = new Problem_705.Solver1();
        p1.add(10);
        p1.add(20);
        p1.add(30);
        p1.add(10);
        p1.contains(30);
        Problem_705.Solver2 p2 = new Problem_705.Solver2();
        p2.add(10);
        p2.add(20);
        p2.add(30);
        p2.add(10);
        p2.contains(30);
    }
}
