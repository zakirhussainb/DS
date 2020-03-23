package com.zakcorp.techiedelight.arrays;

import java.util.*;

public class Problem_3 {
    /*
    Problem:- Print all sub-arrays with zero-sum.
    Description:- Given an array of integers, return all the sub-arrays with zero-sum
    Procedure:-
        1. Easily solvable using Hashing, in linear time.
        2. Create a multimap like Map<Integer, List<Integer>> -> to store {key -> sum, value -> List<Index>}
        3. Create a Pair structure Pair<StartIndex, EndIndex> -> return the list of all Pairs.
     */
    public static void main(String[] args) {
        Solver solver = new Solver();
//        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        int[] arr = {0, 6, 3, -1, -3, 4, -2, 2};
        List<Solver.Pair> pairs = solver.getAllSubArraysWithZeroSum(arr);
        for(Solver.Pair pair : pairs){
            System.out.println(pair.startIndex + "," +pair.endIndex);
        }

    }
    static class Solver {
        static class Pair {
            int startIndex;
            int endIndex;
            public Pair(int startIndex, int endIndex){
                this.startIndex = startIndex;
                this.endIndex = endIndex;
            }
        }
        public List<Pair> getAllSubArraysWithZeroSum(int[] arr){
            int n = arr.length;
            List<Pair> pairList = new ArrayList<>();
            Map<Integer, List<Integer>> multiMap = new HashMap<>();
            // to handle cases where the array starts with a zero
            insertIntoMultiMap(multiMap, 0, -1);
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum = sum + arr[i];
                if(multiMap.containsKey(sum)){
                    List<Integer> list = multiMap.get(sum);
                    for(Integer value : list){
                        pairList.add(new Pair(value + 1, i));
                    }
                }
                insertIntoMultiMap(multiMap, sum, i);
            }
            return pairList;
        }
        public void insertIntoMultiMap(Map<Integer, List<Integer>> map, int key, int value){
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(value);
        }
    }
}
