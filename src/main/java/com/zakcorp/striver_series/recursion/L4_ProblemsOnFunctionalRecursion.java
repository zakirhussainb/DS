package com.zakcorp.striver_series.recursion;

public class L4_ProblemsOnFunctionalRecursion
{
    static class P1_ReverseArray {
        public int[] reverseArrayIterative(int[] arr) {
            int n = arr.length;
            for(int i = 0; i < n / 2; i++) {
                swap(i, n - i - 1, arr);
            }
            return arr;
        }

        public int[] reverseArrayRecursive(int[] arr) {
            recursive(0, arr);
            return arr;
        }

        private void recursive(int i, int[] arr) {
            if(i >= arr.length / 2)
                return;
            swap( i, arr.length - i - 1, arr );
            recursive( i + 1, arr );
        }

        private void swap(int x, int y, int[] arr) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }

    static class P2_Palindrome {
        public boolean checkIfPalindromeRecursive(int[] arr) {
            return recursive(0, arr);
        }
        private boolean recursive(int i, int[] arr) {
            if(i >= arr.length / 2)
                return true;
            if(arr[i] != arr[arr.length - i - 1])
                return false;
            return recursive( i + 1, arr );
        }
    }

}
