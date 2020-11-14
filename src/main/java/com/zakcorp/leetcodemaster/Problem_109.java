package com.zakcorp.leetcodemaster;

public class Problem_109 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solver1 {
        public TreeNode sortedListToBST(ListNode head) {
            int sLLength = getListLength(head);
            int[] sortedArr = new int[sLLength];
            convertListToArr(head, sortedArr);
            return dfs(0, sLLength - 1, sortedArr);
        }
        private TreeNode dfs(int left, int right, int[] arr) {
            if(left > right) {
                return null;
            }
            int mid = (left + right) / 2;
            TreeNode root = new TreeNode(arr[mid]);
            root.left = dfs(left, mid - 1, arr);
            root.right = dfs(mid + 1, right, arr);
            return root;
        }
        private int getListLength(ListNode head) {
            int len = 0;
            ListNode curr = head;
            while(curr != null) {
                len++;
                curr = curr.next;
            }
            return len;
        }
        private void convertListToArr(ListNode head, int[] arr) {
            ListNode curr = head; int i = 0;
            while(curr != null) {
                arr[i++] = curr.val;
                curr = curr.next;
            }
        }
    }
    static class Solver2 {

    }
}
