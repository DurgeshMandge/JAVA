package LinkedList;

public class MiddleOfLL {
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
    public ListNode middleNode(ListNode head) {
        ListNode s = head, f = head;
        while(f != null){
            if(f.next != null){
                f=f.next.next;
            }else{
                return s;
            }
            s=s.next;
        }
        return s;
    }
}
}
