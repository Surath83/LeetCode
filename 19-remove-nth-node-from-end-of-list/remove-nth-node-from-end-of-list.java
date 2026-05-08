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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n == 0) return head;
        if(head.next == null && n == 1) return null;
        ListNode curr = head;
        ListNode pre = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n > size){
            return head;
        }
        size = size - n;
        if(size == 0){
            return head.next;
        }
        curr = head;
        while(curr != null){
            System.out.print(curr.val+"->");
            if(size == 0){
                System.out.print("!"+curr.val+"!");
                pre.next = curr.next;
                curr = curr.next;
            }else{
                pre = curr;
                curr = curr.next;
            }
            size--;
        }
        return head;
    }
}