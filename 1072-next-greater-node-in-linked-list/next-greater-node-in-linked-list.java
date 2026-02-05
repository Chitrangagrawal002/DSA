/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head){
        int n = 0;
        ListNode node = head;
        while(node != null){
            n++;
            node = node.next;
        }
        int res[] = new int[n];
        int idx = 0;
        ArrayDeque<int[]> st = new ArrayDeque<>();
        for(ListNode i = head; i != null; i = i.next){
            while(!st.isEmpty() && st.peek()[0] < i.val){
                res[st.pop()[1]] = i.val;
            }
            st.push(new int[]{i.val, idx++});
        }
        return res;
    }
}