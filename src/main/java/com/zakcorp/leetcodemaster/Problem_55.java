package com.zakcorp.leetcodemaster;

public class Problem_55 {
    public boolean canJump(int[] arr) {
        boolean[] memo = new boolean[arr.length + 1];
        jumpArr(arr, 0, memo);
        return memo[arr.length - 1];
    }
    private boolean jumpArr(int[] arr, int index, boolean[] memo) {
        if( memo[index] ) {
            return true;
        }
//        if(index == arr.length - 1) {
//            memo[index] = true;
//            return true;
//        }
        for(int i = index + 1; i <= arr[index]; i++) {
            if( jumpArr(arr, i, memo) ) {
                memo[index] = true;
                return true;
            }
        }
        memo[index] = false;
        return false;
    }
}