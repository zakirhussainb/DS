package com.zakcorp.final450.searchingandsorting;

/* Reverse the array */
public class P_90 {
    static class Solver {
        public int[] solve1(int[] arr, int n, int x)
        {
            int left = 0, right = n - 1;
            while(arr[left] != x || arr[right] != x) {
                if(arr[left] != x) {
                    left++;
                }
                if(arr[right] != x) {
                    right--;
                }
            }
            System.out.println(left + " " + right);
            return new int[]{left, right};
        }
        public int[] solve2(int[] arr, int n, int x)
        {
            int left = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] == x) {
                    left = i;
                    break;
                }
            }
            int right = 0;
            for(int i = n - 1; i >= 0; i--) {
                if(arr[i] == x) {
                    right = i;
                    break;
                }
            }
            return new int[]{left, right};
        }
    }
}
