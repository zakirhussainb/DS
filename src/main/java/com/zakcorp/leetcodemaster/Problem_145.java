package com.zakcorp.leetcodemaster;
import java.util.*;
public class Problem_145 {
    class TreeNode {
        TreeNode left;
        int val;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        Solver solver = new Solver();
        // List<Integer> list = new ArrayList<>();
        // solver.postorderRecursive(root, list);
        // solver.postorderIterative(root, list);
        return solver.postorderLL(root);
    }
    static class Solver {
        public void postorderRecursive(TreeNode root, List<Integer> list) {
            if(root == null){
                return;
            }
            postorderRecursive(root.left, list);
            postorderRecursive(root.right, list);
            list.add(root.val);
        }
        public void postorderIterative(TreeNode root, List<Integer> list){
            if(root == null){
                return;
            }
            Stack<TreeNode> st = new Stack<>();
            Stack<Integer> out = new Stack<>();
            TreeNode curr = root;
            while(!st.isEmpty() || curr != null){
                if(curr != null){
                    st.push(curr);
                    out.push(curr.val);
                    curr = curr.right;
                } else {
                    curr = st.pop();
                    curr = curr.left;
                }
            }
            while(!out.isEmpty()){
                list.add(out.pop());
            }
        }
        public LinkedList<Integer> postorderLL(TreeNode root){
            LinkedList<Integer> ll = new LinkedList<>();
            if(root == null){
                return ll;
            }
            Stack<TreeNode> st = new Stack<>();
            st.push(root);
            while(!st.isEmpty()){
                TreeNode curr = st.pop();
                ll.addFirst(curr.val);
                if(curr.left != null){
                    st.push(curr.left);
                }
                if(curr.right != null){
                    st.push(curr.right);
                }
            }
            return ll;
        }
    }
}
