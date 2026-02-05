/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node ans = head;
        Node tail = null;
        Stack<Node> st = new Stack<>();
        while(ans != null){
            tail = ans;
            if(ans.child != null){
                if(ans.next != null) st.push(ans.next);
                ans.next = ans.child;
                ans.child.prev = ans;
                ans.child = null;
            }
            ans = ans.next;
        }
        ans = tail;
        if(!st.isEmpty()){
            while(!st.isEmpty()){
                Node temp = st.pop();
                ans.next = temp;
                temp.prev = ans;
                while(ans != null && ans.next != null){
                    ans = ans.next;
                }
            }
        }
        return head;
    }
}