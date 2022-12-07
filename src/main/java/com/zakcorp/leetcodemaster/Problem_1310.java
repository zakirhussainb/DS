package com.zakcorp.leetcodemaster;

public class Problem_1310 {
    // TODO:- Understand Prefix Sum in General, refer GFG,
    //  https://www.geeksforgeeks.org/prefix-sum-array-implementation-applications-competitive-programming/
    static class Solver {
        public int[] solve1(int[] arr, int[][] queries) {
            int n = arr.length;
            int[] prefixXor = new int[n];
            prefixXor[0] = arr[0];
            for(int i = 1; i < arr.length; i++) {
                prefixXor[i] = prefixXor[i - 1] ^ arr[i];
            }

            int[] ans = new int[queries.length];
            for(int i = 0; i < queries.length; i++) {
                int left = queries[i][0];
                int right = queries[i][1];
                if(left == 0)
                    ans[i] = prefixXor[right];
                else
                    ans[i] = prefixXor[right] ^ prefixXor[left - 1];
            }
            return ans;
        }
    }
}
