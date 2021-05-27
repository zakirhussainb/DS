package com.zakcorp.final450.searchingandsorting;

public class P_105 {
    static class Solver {
        // O(N ^ 2) time and O(1) space
        public long[] solve1(int[] arr, int n)
        {
            long[] pro = new long[n];
            for(int i = 0; i < n; i++) {
                pro[i] = 1L;
                for(int j = 0; j < n; j++) {
                    if(i != j) {
                        pro[i] *= arr[j];
                    }
                }
            }
            return pro;
        }

        public long[] solve2(int[] arr, int n)
        {
            long[] L = new long[n];
            long[] R = new long[n];
            long[] result = new long[n];

            L[0] = 1;
            for(int i = 1; i < n; i++) {
                L[i] = L[i - 1] * arr[i - 1];
            }

            R[n - 1] = 1;
            for(int i = n - 2; i >= 0; i--) {
                R[i] = R[i + 1] * arr[i + 1];
            }

            for(int i = 0; i < n; i++) {
                result[i] = L[i] * R[i];
            }

            return result;
        }

        public long[] solve3(int[] arr, int n)
        {
            // The length of the input array
            int length = arr.length;

            // Final answer array to be returned
            long[] answer = new long[length];

            // answer[i] contains the product of all the elements to the left
            // Note: for the element at index '0', there are no elements to the left,
            // so the answer[0] would be 1
            answer[0] = 1;
            for (int i = 1; i < length; i++) {

                // answer[i - 1] already contains the product of elements to the left of 'i - 1'
                // Simply multiplying it with nums[i - 1] would give the product of all
                // elements to the left of index 'i'
                answer[i] = arr[i - 1] * answer[i - 1];
            }

            // R contains the product of all the elements to the right
            // Note: for the element at index 'length - 1', there are no elements to the right,
            // so the R would be 1
            long R = 1;
            for (int i = length - 1; i >= 0; i--) {

                // For the index 'i', R would contain the
                // product of all elements to the right. We update R accordingly
                answer[i] = answer[i] * R;
                R *= arr[i];
            }

            return answer;
        }
    }
}
