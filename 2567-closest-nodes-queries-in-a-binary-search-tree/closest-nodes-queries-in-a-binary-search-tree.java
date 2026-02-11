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
    public void inorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        List<List<Integer>> res = new ArrayList<>();
        for(int q : queries){
            int floor = lower(list, q);
            int ceil  = upper(list, q);
            res.add(Arrays.asList(floor, ceil));
        }

        return res;
    }
    public int lower(List<Integer> list, int target){
        int l = 0, r = list.size()-1;
        int ans = -1;

        while(l <= r){
            int mid = l + (r-l)/2;
            if(list.get(mid) <= target){
                ans = list.get(mid);
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
    public int upper(List<Integer> list, int target){
        int l = 0, r = list.size()-1;
        int ans = -1;

        while(l <= r){
            int mid = l + (r-l)/2;
            if(list.get(mid) >= target){
                ans = list.get(mid);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}