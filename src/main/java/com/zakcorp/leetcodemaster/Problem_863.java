package com.zakcorp.leetcodemaster;

import java.util.*;
/*
Steps:-
Intuition: This is similar to finding the shortest path in an unweighted graph.
Here instead of finding a path, we are finding all the vertices that are 'K' distance from a given source vertex.
1. A tree is a graph. So construct a graph out of the given tree.
2. Perform a BFS on the given target vertex and
3. Stop when you have explored all the vertices that are present at a 'K' distance from the target vertex.
*/
public class Problem_863 {
    static class Solver {
        static class TreeNode {
            TreeNode left;
            int val;
            TreeNode right;
            public TreeNode(int val) {
                this.val = val;
            }
        }
        Map<TreeNode, List<TreeNode>> map = new HashMap<>();
        public List<Integer> solve1(TreeNode root, TreeNode target, int K) {
            List<Integer> result = new ArrayList<>();
            if(root == null) {
                return result;
            }
            if(K == 0) {
                result.add(target.val);
                return result;
            }

            // Construct a Graph using a adjacency List Representation
            constructGraph(root, null);

            // Perform BFS on the target, same as finding Shortest Path in unweighted
            // graph using BFS
            Set<TreeNode> visited = new HashSet<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(target);
            visited.add(target);
            while( K > 0 ) {
                K--;
                int size = queue.size();
                while(size --> 0) {
                    TreeNode curr = queue.poll();
                    for (TreeNode next : map.get(curr)) {
                        if (!visited.contains(next)) {
                            if (K == 0) {
                                result.add(next.val);
                            }
                            visited.add(next);
                            queue.add(next);
                        }
                    }
                }
            }
            return result;
        }
        private void constructGraph(TreeNode root, TreeNode parent) {
            if(root == null)
                return;
            if(map.containsKey(root))
                return;
            map.put(root, new ArrayList<>());
            if(parent != null) {
                map.get(root).add(parent);
                map.get(parent).add(root);
            }
            constructGraph(root.left, root);
            constructGraph(root.right, root);
        }
    }
}
