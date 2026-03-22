import java.math.BigInteger;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(l1 != null){
            sb1.insert(0,l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            sb2.insert(0,l2.val);
            l2 = l2.next;
        }
        BigInteger a = new BigInteger(sb1.toString());
        BigInteger b = new BigInteger(sb2.toString());
        BigInteger res = a.add(b);
        String str = String.valueOf(res);
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for(int i=str.length()-1; i>=0; i--){
            ListNode temp = new ListNode(str.charAt(i) - '0');
            curr.next = temp;
            curr = curr.next;
        }
        return head.next;
    }
}