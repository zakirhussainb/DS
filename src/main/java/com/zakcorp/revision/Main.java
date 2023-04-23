package com.zakcorp.revision;

import com.zakcorp.leetcodemaster.classes.TreeNode;

public class Main
{
/*
Given an array of positive integers nums and a positive integer target, return the minimal length of a
subarray
whose sum is equal to target. If there is no such subarray, return 0 instead.
target = 6, nums = [1,3,2,1,2,4,3]
 */

  public static void main(String[] args) {
//    findMinSubarrayLength( new int[]{1,3,2,1,2,4,3}, 6 ); // Expected -> sI = 4, eI = 5, minL = 2
    TreeNode root = new TreeNode(-10);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);


    TreeNode root1 = new TreeNode(100);
    root1.left = new TreeNode(9);
    root1.right = new TreeNode(20);
    root1.right.left = new TreeNode(15);
    root1.right.right = new TreeNode(7);

    int res = maxPathSum( root1 );
    System.out.println("Res.." + res);
  }

  // [-10,9,20,null,null,15,7]
  private static int maxPathSum( TreeNode root ) {
    int[] maxVal = {0};
    calculateMaxPathSum(root, maxVal, 0);
    return maxVal[0];
  }
  private static int calculateMaxPathSum(TreeNode root, int[] maxVal, int sum) {
    if(root == null)
      return 0;
    int left = calculateMaxPathSum( root.left, maxVal, sum );
    int right = calculateMaxPathSum( root.right, maxVal, sum );
    sum += root.val + Math.max(left, right);
    if(sum < 0)
      sum = 0;
    maxVal[0] = Math.max( maxVal[0], sum );
    return sum;
  }

  private static void findMinSubarrayLength(int[] arr, int target) {
    int startIndex = 0, endIndex = 0;
    int n = arr.length;
    int minLength = Integer.MAX_VALUE;
    int left = 0;
    int sum = 0;
    for(int right = 0; right < n; ) {
      sum += arr[right];
      while(sum >= target && right < n)
      {
        if ( sum == target )
        {
          startIndex = left;
          endIndex = right;
          minLength = Math.min( minLength, right - left + 1 );
        }
        else
        {
          sum -= arr[ left ];
          left++;
        }
        right++;
      }
    }
    System.out.println("startIndex...." + startIndex);
    System.out.println("endIndex...." + endIndex);
    System.out.println("minLength...." + minLength);
  }


}
