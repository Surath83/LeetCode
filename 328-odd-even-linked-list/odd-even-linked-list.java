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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode nex = head.next.next;
        ListNode head2 = cur;
        ListNode temp = head2;
        head2.next = null;
        pre.next=nex;
        while(nex.next != null || cur.next != null){
            pre = pre.next;
            cur = pre.next;
            if(cur.next == null){
                temp.next = cur;
                break;
            }
            
            nex = cur.next;
            
            temp.next = cur;
            temp.next.next = null;
            temp = temp.next;
            pre.next = nex;

        }

        nex.next = head2;
        return head;
    }
}