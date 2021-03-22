package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.*;

public class P_176 {
    static class Solver {
        // Diagonal Traversal of a Binary Tree
        public List<Integer> solve1(BinaryTree.Node root) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            preorder(root, 0, map);
            List<Integer> output = new ArrayList<>();
            for(int i = 0; i < map.size(); i++) {
                output.addAll(map.get(i));
            }
            return output;
        }
//        public List<Integer> solve2(BinaryTree.Node root) {
//
//        }
        private void preorder(BinaryTree.Node root, int diagonal, Map<Integer, List<Integer>> map) {
            if(root == null)
                return;
            map.putIfAbsent(diagonal, new ArrayList<>());
            map.get(diagonal).add(root.data);

            preorder(root.left, diagonal + 1, map);
            preorder(root.right, diagonal, map);
        }
    }
}
