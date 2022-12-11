package com.zakcorp.leetcodemaster;

import java.util.*;
public class Problem_1361
{
    static class Solver {
        public boolean solve1(int n, int[] leftChild, int[] rightChild) {
            // In a tree there can be only one single root node(i.e. in-degree = 0) and all other nodes have in-degree = 1
            // If a node has a parent already then its in-degree cannot exceed 1
            int[] indegree = new int[n];
            for(int i = 0; i < n; i++) {
                if(leftChild[i] != -1 && indegree[leftChild[i]]++ == 1)
                    return false;
                if(rightChild[i] != -1 && indegree[rightChild[i]]++ == 1) {
                    return false;
                }
            }
            // Till now, we have not identified the root. Let's find it now. We can see from the indegree array that
            // a root must have the indegree as 0.
            int root = -1;
            for(int i = 0; i < n; i++) {
                if(indegree[i] == 0) {
                    if(root != -1)
                        return false;
                    root = i;
                }
            }
            if(root == -1)
                return false;
            Set<Integer> set = new HashSet<>();
            dfs(root, leftChild, rightChild, set);
            return set.size() == n; // if all the nodes from the root are visited then it means that this is a valid binary tree
        }
        private void dfs(int root, int[] leftChild, int[] rightChild, Set<Integer> set) {
            if(set.contains( root ))
                return;
            set.add( root );
            if(leftChild[root] != -1)
                dfs(leftChild[root], leftChild, rightChild, set);
            if(rightChild[root] != -1)
                dfs(rightChild[root], leftChild, rightChild, set);
        }
    }
}
