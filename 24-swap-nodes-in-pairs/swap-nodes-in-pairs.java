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
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode list = new ListNode(0);
        list.next = head;
        ListNode pre = list;
        while(pre.next != null && pre.next.next != null){
            ListNode cur = pre.next;
            ListNode nxt = pre.next.next;

            cur.next = nxt.next;
            nxt.next = cur;
            pre.next = nxt;

            pre = cur; 
        }
        return list.next;
    }
}