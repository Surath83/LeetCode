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
        if(head == null || head.next == null || k==0) return head;
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
    }
}