package com.zakcorp.leetcodemaster;

import java.util.*;
import java.util.stream.Collectors;

public class Problem_658 {
    static class Solver {
        public List<Integer> solve1(int[] arr, int k, int x) {
            int n = arr.length;
            List<Integer> result = new ArrayList<>();
            int index = Arrays.binarySearch(arr, x);
            index = index < 0 ? -1 : index;
            if(index == -1) {
                if(x < arr[0]) {
                    for(int i = 0; i < k; i++) {
                        result.add(arr[i]);
                    }
                } else {
                    for(int i = n - 1; i >= 0; i--) {
                        if(result.size() < k) {
                            result.add(0, arr[i]);
                        }
                    }
                }
                return result;
            }
            int left = index - 1, right = index + 1;
            result.add(arr[index]);
            while(left >= 0 && right < n) {
                int res1 = Math.abs(arr[left] - x);
                int res2 = Math.abs(arr[right] - x);
                if(res1 < res2 || res1 == res2 && arr[left] < arr[right]) {
                    if(result.size() < k) {
                        result.add(arr[left]);
                    }
                    if(result.size() < k) {
                        result.add(arr[right]);
                    }
                    left--;
                    right++;
                }
            }
            while(left >= k) {
                if(result.size() < k) {
                    result.add(arr[left--]);
                }
            }
            if(right >= n) {
                while(right > 0) {
                    if(result.size() < k) {
                        if(right >= n) {
                            right = n - 2;
                        }
                        result.add(arr[right]);
                    }
                    right--;
                }
            } else {
                while(right < k) {
                    if(result.size() < k) {
                        result.add(arr[right++]);
                    }
                }
            }
            Collections.sort(result);
            return result;
        }
        public List<Integer> solve2(int[] arr, int k, int x) {
            List<Integer> input =
                    Arrays.stream(arr)
                            .boxed()
                            .sorted((a, b) -> a == b ? a - b : Math.abs(a - x) - Math.abs(b - x))
                            .collect(Collectors.toList());
            input = input.subList(0, k);
            Collections.sort(input);
            return input;
        }
    }
}
