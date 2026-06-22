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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        List<ListNode> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            list.add(curr);
            curr = curr.next;
        }
        int n = list.size();
        k %= n;
        if(k==0) return head;
        int idx = n-k;
        ListNode head1 = list.get(idx);
        ListNode temp = head1;
        for(int j=idx+1; j<list.size(); j++){
            temp.next = list.get(j);
            temp = temp.next;
        }
        for(int j=0; j<idx; j++){
            temp.next = list.get(j);
            temp = temp.next;
        }
        temp.next = null;
        return head1;

        // if(head == null || head.next == null) return head;
        // ListNode curr = head;
        // int len = 0;
        // while(curr.next != null){
        //     curr = curr.next;
        //     len++;
        // }
        // ListNode end = curr;
        // curr.next = head;
        // while(k>0){
        //     head = end;
        //     int i=0;
        //     while(i<len){
        //         end = end.next;
        //         i++;
        //     }
        //     k--;
        //     if(k==0){
        //         end.next = null;
        //     }
        // }
        // return head;
    }
}