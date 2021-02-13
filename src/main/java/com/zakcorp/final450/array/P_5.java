package com.zakcorp.final450.array;

/* Reverse the array */
public class P_5 {
    static class Solver {
        public int[] solve1(int[] arr) {
            int n = arr.length;
            int x = 0, y = n - 1;
            while(x <= y) {
                if(arr[x] < 0 && arr[y] < 0) {
                    x++;
                } else if(arr[x] > 0 && arr[y] > 0) {
                    y--;
                } else if(arr[x] > 0 && arr[y] < 0) {
                    swap(x, y, arr);
                    x++;
                    y--;
                } else if(arr[x] < 0 && arr[y] > 0) {
                    x++;
                    y--;
                }
            }
            return arr;
        }
        private void swap(int x, int y, int[] arr) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }
}
