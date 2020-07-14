package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_989 {
    public List<Integer> addToArrayForm(int[] arr, int num) {
        List<Integer> ll = new LinkedList<>();
        int n = arr.length;
        int i = n - 1; int carry = 0;
        while(i >= 0 || num > 0) {
            int sum = carry;
            if(i >= 0) {
                sum = sum + arr[i];
            }
            sum = sum + num % 10;
            if(sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ll.add(0, sum);
            num = num / 10;
            i--;
        }
        if(carry > 0) {
           ll.add(0, carry);
        }
        return ll;
    }
}
