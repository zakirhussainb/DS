package com.zakcorp.final450.linkedlist;


public class P_139 {
    static class SinglyLinkedList {
        static class Node {
            Node next;
            int data;
            public Node(int data) {
                this.data = data;
            }
        }
    }
    static class Solver {
        public int[] solve1(int[] arr) {
            int n = arr.length;
            int left = 0, high = n - 1;
            while(left <= high) {
                int temp = arr[left];
                arr[left] = arr[high];
                arr[high] = temp;
                left++;
                high--;
            }
            return arr;
        }
    }
}
