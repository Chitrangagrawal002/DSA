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
public class Solution {
    int result;
    public Pair<Integer, Integer> solve(TreeNode root) {
        if (root == null) {
            return new Pair<>(0, 0);
        }
        Pair<Integer, Integer> left = solve(root.left);
        Pair<Integer, Integer> right = solve(root.right);
        int leftSum = left.getKey();
        int leftCount = left.getValue();
        int rightSum = right.getKey();
        int rightCount = right.getValue();
        int SUM = leftSum + rightSum + root.val;
        int COUNT = leftCount + rightCount + 1;
        int avg = SUM / COUNT;
        if (avg == root.val) {
            result++;
        }
        return new Pair<>(SUM, COUNT);
    }
    public int averageOfSubtree(TreeNode root) {
        result = 0;
        solve(root);
        return result;
    }
}