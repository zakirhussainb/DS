package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.*;

public class P_182 {
    static class Solver {
        public int solve1(BinaryTree.Node root) {
            List<Integer> list = new ArrayList<>();
            inorderListOfBT(root, list);
            int[] arr = new int[list.size()];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = list.get(i);
            }
            return minSwapsToSort(arr);
        }
        private int minSwapsToSort(int[] arr) {
            int n = arr.length;
            int[] temp = Arrays.copyOfRange(arr, 0, n);
            Arrays.sort(temp);
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                map.put(arr[i], i);
            }
            int result = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] != temp[i]) {
                    result++;
                    int x = arr[i];
                    swap(arr, i, map.get(temp[i]));
                    map.put(x, map.get(temp[i]));
                    map.put(temp[i], i);
                }
            }
            return result;
        }
        private void swap(int[] arr, int x, int y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        private void inorderListOfBT(BinaryTree.Node root, List<Integer> list) {
            if(root == null){
                return;
            }
            inorderListOfBT(root.left, list);
            list.add(root.data);
            inorderListOfBT(root.right, list);
        }
    }
}
