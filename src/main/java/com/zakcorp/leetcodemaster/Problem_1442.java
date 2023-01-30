package com.zakcorp.leetcodemaster;

public class Problem_1442
{
    static class Solver {
        // Solution Reference : https://youtu.be/-WPBj3Jw0xA
        // This is based on prefix sum concept
        public int solve1(int[] arr) {
            int n = arr.length;
            int[] prefix = new int[n + 1];
            for(int i = 1; i <= n; i++) {
                prefix[i] = prefix[i - 1] ^ arr[i - 1];
            }
            int ans = 0;
            for(int i = 1; i <= n; i++) {
                for(int j = i + 1; j <= n; j++) {
                    for(int k = j; k <= n; k++) {
                        int a = prefix[i - 1] ^ prefix[j - 1];
                        int b = prefix[k] ^ prefix[j - 1];
                        if( a == b ) {
                            ans++;
                        }
                    }
                }
            }
            return ans;
        }
    }
}
