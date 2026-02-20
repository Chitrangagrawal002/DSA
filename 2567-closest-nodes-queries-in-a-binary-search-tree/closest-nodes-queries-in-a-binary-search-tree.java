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
    public void inorder(List<Integer> list, TreeNode root){
        if(root == null) return;
        inorder(list, root.left);
        list.add(root.val);
        inorder(list, root.right);
    }
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> list = new ArrayList<>();
        inorder(list, root);
        List<List<Integer>> ans = new ArrayList<>();
        for(int q : queries){
            ans.add(search(q, list));
        }
        return ans;
    }
    public List<Integer> search(int q, List<Integer> list){
        int l = 0;
        int h = list.size() - 1;
        int floor = -1;
        while(l <= h){
            int mid = l + (h - l) / 2;
            if(list.get(mid) <= q){
                floor = list.get(mid);
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        l = 0;
        h = list.size() - 1;
        int ceil = -1;
        while(l <= h){
            int mid = l + (h - l) / 2;
            if(list.get(mid) >= q){
                ceil = list.get(mid);
                h = mid - 1;
            } 
            else{
                l = mid + 1;
            }
        }
        return Arrays.asList(floor, ceil);
    }
}