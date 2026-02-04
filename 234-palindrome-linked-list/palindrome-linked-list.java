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
    public ListNode reverse(ListNode head) {
        ListNode cur = head, prev = null, next;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null) return false;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = reverse(slow);
        while(second != null){
            if(head.val != second.val){
                return false;
            }
            head = head.next;
            second = second.next;
        }
        return true;
    }
}