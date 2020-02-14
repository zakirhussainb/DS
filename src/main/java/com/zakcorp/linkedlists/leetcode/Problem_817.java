package com.zakcorp.linkedlists.leetcode;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;

import java.util.HashSet;

public class Problem_817 {
    public static void main(String[] args) {
        SinglyLLIntImpl linkedList = new SinglyLLIntImpl();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        int[] G = {0, 1, 3};
        System.out.println("output..." + numComponents(linkedList.head, G));
    }
    public static int numComponents(SinglyLLIntImpl.Node head, int[] G){
        HashSet<Integer> arrSet = new HashSet<>();
        for(int num : G){
            arrSet.add(num);
        }
        int ans = 0;
        SinglyLLIntImpl.Node curr = head;
        while(curr != null){
            if(arrSet.contains(curr.data) && (curr.next == null || !arrSet.contains(curr.next.data))){
                ans++;
            }
            curr = curr.next;
        }
        return ans;
    }
}
