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
    public TreeNode helper(TreeNode root, int target) {
        if (root == null) return null;
        TreeNode leftNode = helper(root.left, target);
        TreeNode rightNode = helper(root.right, target);
        if (leftNode == null && rightNode == null && root.val == target) {
            return null;
        }
        TreeNode newNode = new TreeNode(root.val);
        newNode.left = leftNode;
        newNode.right = rightNode;
        return newNode;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return helper(root, target);
    }
}