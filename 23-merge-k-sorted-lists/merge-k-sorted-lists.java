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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < lists.length; i++){
            ListNode curr = lists[i];
            while(curr != null){
                pq.add(curr.val);
                curr = curr.next;
            }
        }
        ListNode res = new ListNode(0);
        ListNode ans = res;
        while(!pq.isEmpty()){
            ListNode curr = new ListNode(pq.poll());
            ans.next = curr;
            ans = ans.next;
        }
        return res.next;
    }
}