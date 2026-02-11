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
    static boolean solve(TreeNode l, TreeNode r){
        if(l==null && r==null) return true;

        if(l==null || r==null ) return false;
       
        boolean f=(l.val==r.val) && solve(l.left,r.right);
        boolean s=(l.val==r.val) && solve(l.right,r.left);

        return f&&s;
    }
    public boolean isSymmetric(TreeNode root) {
        return solve(root.left,root.right);
    }
}