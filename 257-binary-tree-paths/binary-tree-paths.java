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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root != null) {
            generate(root, ans, "");
        }
        return ans;
    }
    public void generate(TreeNode root, List<String> ans, String s){
        if(root.left == null && root.right == null){
            ans.add(s + root.val);
            return;
        }
        if(root.left != null) generate(root.left, ans, s + root.val + "->");
        if(root.right != null) generate(root.right, ans, s + root.val + "->");
    }
}