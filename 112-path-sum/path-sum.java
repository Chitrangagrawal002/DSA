/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean helper(TreeNode root, int target, int sum){
        if(root == null) return false;
        sum += root.val;
        if(root.left == null && root.right == null){
            return sum == target;
        }
        boolean left = helper(root.left, target, sum);
        boolean right = helper(root.right, target, sum);
        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum, 0);
    }
}