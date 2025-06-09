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
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode nd = null;
        while(temp!=null){
            ListNode sec = temp.next;
            temp.next = nd;
            nd = temp;
            temp = sec; 
        }
        ListNode first = head;
        temp = nd;
        while(temp!=null){
            ListNode t = first.next;
            ListNode t1 = temp.next;
            first.next = temp;
            temp.next = t;
            first = t;
            temp = t1;
        }     
    }
}
