/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        while(head == null || head.next == null){
            return false;
        }
        ListNode f = head;
        ListNode s = head;

        while(f.next!=null && f.next.next!=null){
            f = f.next.next;
            s = s.next;
            if(f==s){
                return true;
            }
        }
        
        return false;
    }
}
