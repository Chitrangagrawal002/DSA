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
    public ListNode reverse(ListNode head){
        ListNode curr = head, prev = null, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode first = reverse(head);
        int carry = 0;
        ListNode Newhead = first;
        ListNode previous = null;
        while(Newhead != null){
            if(Newhead.val < 5){
                if(carry == 1){
                    Newhead.val = (2 * Newhead.val) % 10 + 1;
                    carry = 0;
                }
                else{
                    Newhead.val = (2 * Newhead.val) % 10;
                }
            } 
            else{
                if(carry == 1){
                    Newhead.val = (2 * Newhead.val) % 10 + 1;
                }
                else{
                    Newhead.val = (2 * Newhead.val) % 10;
                    carry = 1;
                }
            }
            previous = Newhead;
            Newhead = Newhead.next;
        }
        if(carry == 1){
            previous.next = new ListNode(1);
        }
        return reverse(first);
    }
}