package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_702 {
    static class ArrayReader {
        public int get(int index) {
            return 0;
        }
    }
    static class Solver {
        public int solve1(ArrayReader reader, int target) {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i <= 10000; i++) {
                if(reader.get(i) == Integer.MAX_VALUE) {
                    break;
                }
                list.add(reader.get(i));
            }
            Integer[] arr = list.toArray(new Integer[0]);
            int res = Arrays.binarySearch(arr, target);
            return res < 0 ? -1 : res;
        }
        public int solve2(ArrayReader reader, int target) {
            int res = -1;
            for(int i = 0; i <= 10000; i++) {
                if(reader.get(i) == Integer.MAX_VALUE) {
                    break;
                }
                if(reader.get(i) == target) {
                    res = i;
                }
            }
            return res;
        }
        public int solve3(ArrayReader reader, int target) {
            // High can be calculated in many different ways
            /*
            1. Set high to 10000
            2. high = target - reader.get(0);
            3. int high = 1;
            while(reader.get(high) < target) {
                high = high * 2;
            }
             */
            int low = 0, high = 10000;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(reader.get(mid) < target) {
                    low = mid + 1;
                } else if(reader.get(mid) > target) {
                    high = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
        public int solve4(ArrayReader reader, int target) {
            int low = 0, high = target - reader.get(0);
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(reader.get(mid) < target) {
                    low = mid + 1;
                } else if(reader.get(mid) > target) {
                    high = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }
}
