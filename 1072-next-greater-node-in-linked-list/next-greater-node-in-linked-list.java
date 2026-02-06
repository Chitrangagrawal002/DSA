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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int n = list.size();
        int res[] = new int[n];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && list.get(st.peek()) < list.get(i)){
                res[st.pop()] = list.get(i); 
            }
            st.push(i);
        }
        return res;
    }
}