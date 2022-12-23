package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2012
{
    // This solution is good, but it is producing TLE for very large inputs.
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 1; i <= n - 2; i++) {
                for(int j = 0; j < i; j++) {
                    for(int k = i + 1; k <= n - 1; k++) {
                        if(arr[j] < arr[i] && arr[i] < arr[k]) {
                            map.put(i, 1);
                        } else {
                            map.put(i, -1);
                            break;
                        }
                    }
                    if( map.get( i ) == -1)
                        break;
                }
                if( map.get( i ) != -1) {
                    map.put(i, 2);
                }
            }
            for(int i = 1; i <= n - 2; i++) {
                if(map.containsKey( i )) {
                    if(map.get( i ) == -1) {
                        if(arr[i - 1] < arr[i] && arr[i] < arr[i + 1]) {
                            map.put(i, 1);
                        } else {
                            map.put(i, 0);
                        }
                    }
                }
            }
            return map.values().stream().mapToInt( Integer::intValue ).sum();
        }
    }
    static class Solver1 {
        /* Concept behind the below code:
        1. For the beauty value of the ith element to be 2,
            -> It should be greater than all the elements on its left.
            -> And smaller than all the elements on its right.
        2. So it should be,
            -> Greater than the maximum of all elements on the left.
            -> Smaller than minimum of all elements on the right.
        3. To do this, we need to maintain two arrays,
         */
        public int solve1(int[] arr) {
            int n = arr.length;
            // Maintain minimum from right
            int[] min = new int[n + 1];
            // Maintain maximum from left
            int[] max = new int[n + 1];
            min[n] = Integer.MAX_VALUE;
            for(int i = 0, j = n - 1; i < n; i++, j--) {
                max[i + 1] = Math.max( arr[i], max[i] );
                min[j] = Math.min( arr[j], min[j + 1] );
            }
            int sum = 0;
            for(int i = 1; i < n - 1; i++) {
                if(max[i] < arr[i] && arr[i] < min[i + 1]) {
                    sum += 2;
                } else if(arr[i - 1] < arr[i] && arr[i] < arr[i + 1]) {
                    sum++;
                }
            }
            return sum;
        }
    }
    static class Solver2 {
        public int solve1(int[] arr) {
            int n = arr.length;
            boolean[] left = new boolean[n];
            boolean[] right = new boolean[n];

            left[0] = true;
            int leftMax = arr[0];
            for(int i = 1; i < n; i++) {
                if(arr[i] > leftMax) {
                    leftMax = arr[i];
                    left[i] = true;
                }
            }
            right[n - 1] = true;
            int rightMin = arr[n - 1];
            for(int i = n - 2; i>= 0; i--) {
                if(arr[i] < rightMin) {
                    rightMin = arr[i];
                    right[i] = true;
                }
            }

            int sum = 0;
            for(int i = 1; i <= n - 2; i++) {
                if(left[i] && right[i]) {
                    sum += 2;
                } else if(arr[i - 1] < arr[i] && arr[i] < arr[i + 1]) {
                    sum += 1;
                }
            }
            return sum;
        }
    }
}
