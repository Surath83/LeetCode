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
    public int pairSum(ListNode head) {
        if(head.next.next == null) return (head.val+head.next.val);
        ListNode head2;
        ListNode temp = head;
        ListNode temp2 = head;
        int i = 1;
        while(temp.next != null){
            i++;
            temp = temp.next;
        }
        head2 = temp;
        int k=1;
        while( k != i/2){ 
            temp2 = temp2.next;
            k++;
        }
        temp = temp2.next;
        temp2.next = null;
        temp2 = temp.next;
        temp.next = null;
        while(temp2.next != null){
            ListNode temp3 = temp2.next;
            temp2.next = temp;
            temp = temp2;
            temp2 = temp3;
        }
        temp2.next = temp;

        int maxsum = Integer.MIN_VALUE;
        while(head !=null && head2 != null){
            int sum = (head.val+head2.val);
            maxsum = Math.max(maxsum, sum);
            head = head.next;
            head2 = head2.next;
        }
        return maxsum;
    }
}