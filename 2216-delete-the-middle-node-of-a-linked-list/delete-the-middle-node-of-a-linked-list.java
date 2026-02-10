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
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
        ListNode temp = head;
        if(head.next==null)return null;
        while(temp.next!=null){
            if(temp.next.next==null){
                curr.next=curr.next.next;
                return head;
            }
            else{
            temp=temp.next.next;
            if(temp.next==null){
                curr.next=curr.next.next;
                return head;
            }
            curr=curr.next;
        }
        }
    return head;
    }
}