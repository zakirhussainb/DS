package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.*;

import org.apache.commons.collections4.list.TreeList;

public class Problem_987
{
    static class Solver {
        static class NodeInfo {
            TreeNode node;
            int pos;
            int level;
            public NodeInfo(TreeNode node, int pos, int level) {
                this.node = node;
                this.pos = pos;
                this.level = level;
            }
        }
        static class MyComparatorWork implements Comparator<NodeInfo> {

            @Override
            public int compare( NodeInfo n1, NodeInfo n2 )
            {
                return 0;
            }
        }
        public List<List<Integer>> solve1(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if(root == null)
                return res;
            TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> tMap = new TreeMap<>();
            Queue<NodeInfo> queue = new LinkedList<>();
            queue.add(new NodeInfo( root, 0, 0 ));
            while(!queue.isEmpty()) {
                NodeInfo n = queue.poll();
                if(!tMap.containsKey( n.pos )) {
                    tMap.put( n.pos, new TreeMap<>() );
                }
                if(!tMap.get( n.pos ).containsKey( n.level )) {
                    tMap.get( n.pos ).put(n.level, new PriorityQueue<>());
                }
                tMap.get( n.pos ).get( n.level ).add( n.node.val );

                if(n.node.left != null) {
                    queue.add(new NodeInfo( n.node.left, n.pos - 1, n.level + 1 ));
                }
                if(n.node.right != null) {
                    queue.add(new NodeInfo(n.node.right, n.pos + 1, n.level + 1));
                }
            }

            for(TreeMap<Integer, PriorityQueue<Integer>> ts : tMap.values()) {
                res.add( new ArrayList<>() );
                for(PriorityQueue<Integer> nodes : ts.values()) {
                    while(!nodes.isEmpty()) {
                        res.get( res.size() - 1 ).add( nodes.poll() );
                    }
                }
            }
            return res;
        }
    }
}
