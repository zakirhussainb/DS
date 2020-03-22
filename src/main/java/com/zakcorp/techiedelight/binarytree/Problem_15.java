package com.zakcorp.techiedelight.binarytree;

import java.util.*;

public class Problem_15 {
    /*
    Problem:- Check if a given binary tree is a Complete BT or not.
    Description:- A complete BT is a BT in which every level, except possibly the last, is completely
    filled and all nodes are as far left as possible.
    Ideology:- When filled in an array, all the indexes must be filled and there must be no empty spaces in the array.
    TODO:- Procedure:-
        1.
     */
    public static void main(String[] args) {
        BinaryTreeImpl bTImpl = new BinaryTreeImpl();
        BinaryTreeImpl.Node root = bTImpl.dataGeneration();
        Problem_15.Solver solver = new Problem_15.Solver();
        if(solver.isComplete(root)){
            System.out.println("Given BT is Complete....");
        } else {
            System.out.println("Given BT is NOT Complete....");
        }
        if(solver.isCompleteUsingBooleanArray(root)){
            System.out.println("Given BT is Complete....");
        } else {
            System.out.println("Given BT is NOT Complete....");
        }
    }
    static class Solver {
        public boolean isComplete(BinaryTreeImpl.Node root){
            // If tree is empty it is complete.
            if(root == null){
                return true;
            }
            Queue<BinaryTreeImpl.Node> queue = new ArrayDeque<>();
            queue.add(root);
            boolean flag = false;
            while(!queue.isEmpty()){
                BinaryTreeImpl.Node curr = queue.poll();
                // If we have encountered a non-full node before and current
                // node is not a leaf, tree cannot be complete.
                if( flag && (curr.left != null || curr.right != null) ){
                    return false;
                }
                // if left child is empty and right child exists, tree cannot be complete.
                if(curr.left == null && curr.right != null){
                    return false;
                }
                // if left child is not empty, enqueue it
                if(curr.left != null){
                    queue.add(curr.left);
                } else { // if current node is a non-full node, set flag to true
                    flag = true;
                }
                // if right child is not empty, enqueue it
                if(curr.right != null){
                    queue.add(curr.right);
                } else { // if current node is non-full node, set flag to true
                    flag = true;
                }
            }
            return true;
        }
        public boolean isCompleteUsingBooleanArray(BinaryTreeImpl.Node root){
            if(root == null){
                return true;
            }
            int size = getSize(root);
            boolean[] bArr = new boolean[size];
            inorder(root, 0, bArr);
            for(boolean a : bArr){
                if(!a){
                    return false;
                }
            }
            return true;
        }
        public void inorder(BinaryTreeImpl.Node root, int i, boolean[] bArr){
            if(root == null || i >= bArr.length){
                return;
            }
            inorder(root.left, 2 * i + 1, bArr);
            bArr[i] = true;
            inorder(root.right, 2 * i + 2, bArr);
        }
        public int getSize(BinaryTreeImpl.Node root){
            if(root != null){
                return getSize(root.left) + getSize(root.right) + 1;
            }
            return 0;
        }
    }
}
